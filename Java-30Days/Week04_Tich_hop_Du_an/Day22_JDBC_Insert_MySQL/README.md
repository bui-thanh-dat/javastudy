# 🗄️ Day 22: JDBC Insert MySQL

## 🎯 Mục Tiêu Hôm Nay

- Hiểu kiến trúc JDBC và cách kết nối database
- Cài đặt MySQL và JDBC driver
- Thực hiện thao tác INSERT vào database
- Xử lý ngoại lệ khi làm việc với database
- Tạo form nhập liệu với validation

## 📚 Kiến Thức Cần Nắm

### **1. JDBC là gì?**
JDBC (Java Database Connectivity) là API cho phép Java kết nối và thao tác với cơ sở dữ liệu.

### **2. Kiến trúc JDBC**
```
Java Application → JDBC API → JDBC Driver → Database
```

### **3. Các bước kết nối database**
1. Load JDBC Driver
2. Tạo Connection
3. Tạo Statement/PreparedStatement
4. Thực thi query
5. Xử lý kết quả
6. Đóng connection

## 🛠️ Cài Đặt Môi Trường

### **Bước 1: Cài đặt MySQL**
1. Tải [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
2. Cài đặt và tạo root password
3. Tạo database và user

### **Bước 2: Tải JDBC Driver**
1. Tải [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)
2. Thêm JAR file vào classpath

### **Bước 3: Tạo database**
```sql
CREATE DATABASE student_management;
USE student_management;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT,
    email VARCHAR(100),
    phone VARCHAR(20),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Kết nối database cơ bản**
```java
import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Test connection
            Connection conn = getConnection();
            System.out.println("Kết nối database thành công!");
            
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối database: " + e.getMessage());
        }
    }
}
```

### **Bài 2: INSERT dữ liệu cơ bản**
```java
import java.sql.*;

public class StudentInsert {
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password";
    
    public static void insertStudent(String name, int age, String email, String phone) {
        String sql = "INSERT INTO students (name, age, email, phone) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Set parameters
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, email);
            pstmt.setString(4, phone);
            
            // Execute insert
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Thêm sinh viên thành công!");
            } else {
                System.out.println("Thêm sinh viên thất bại!");
            }
            
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm sinh viên: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy JDBC driver: " + e.getMessage());
            return;
        }
        
        // Thêm sinh viên
        insertStudent("Nguyễn Văn A", 20, "nguyenvana@email.com", "0123456789");
        insertStudent("Trần Thị B", 19, "tranthib@email.com", "0987654321");
    }
}
```

### **Bài 3: INSERT với validation**
```java
import java.sql.*;
import java.util.Scanner;

public class StudentInsertWithValidation {
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password";
    
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
    
    public static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,11}");
    }
    
    public static boolean isValidAge(int age) {
        return age >= 16 && age <= 100;
    }
    
    public static void insertStudentWithValidation() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        
        // Nhập tên
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Tên không được để trống!");
            return;
        }
        
        // Nhập tuổi
        System.out.print("Nhập tuổi: ");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
            if (!isValidAge(age)) {
                System.out.println("Tuổi phải từ 16-100!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Tuổi phải là số!");
            return;
        }
        
        // Nhập email
        System.out.print("Nhập email: ");
        String email = scanner.nextLine().trim();
        if (!isValidEmail(email)) {
            System.out.println("Email không hợp lệ!");
            return;
        }
        
        // Nhập số điện thoại
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine().trim();
        if (!isValidPhone(phone)) {
            System.out.println("Số điện thoại không hợp lệ!");
            return;
        }
        
        // Thực hiện insert
        insertStudent(name, age, email, phone);
    }
    
    public static void insertStudent(String name, int age, String email, String phone) {
        String sql = "INSERT INTO students (name, age, email, phone) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, email);
            pstmt.setString(4, phone);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("✅ Thêm sinh viên thành công!");
            } else {
                System.out.println("❌ Thêm sinh viên thất bại!");
            }
            
        } catch (SQLException e) {
            System.out.println("❌ Lỗi database: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            insertStudentWithValidation();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Không tìm thấy JDBC driver: " + e.getMessage());
        }
    }
}
```

### **Bài 4: Batch Insert**
```java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BatchInsert {
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password";
    
    public static class Student {
        String name;
        int age;
        String email;
        String phone;
        
        public Student(String name, int age, String email, String phone) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.phone = phone;
        }
    }
    
    public static void batchInsertStudents(List<Student> students) {
        String sql = "INSERT INTO students (name, age, email, phone) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Disable auto-commit for batch operations
            conn.setAutoCommit(false);
            
            for (Student student : students) {
                pstmt.setString(1, student.name);
                pstmt.setInt(2, student.age);
                pstmt.setString(3, student.email);
                pstmt.setString(4, student.phone);
                pstmt.addBatch();
            }
            
            // Execute batch
            int[] results = pstmt.executeBatch();
            
            // Commit transaction
            conn.commit();
            
            int totalInserted = 0;
            for (int result : results) {
                totalInserted += result;
            }
            
            System.out.println("✅ Đã thêm " + totalInserted + " sinh viên thành công!");
            
        } catch (SQLException e) {
            System.out.println("❌ Lỗi batch insert: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            List<Student> students = new ArrayList<>();
            students.add(new Student("Nguyễn Văn A", 20, "a@email.com", "0123456789"));
            students.add(new Student("Trần Thị B", 19, "b@email.com", "0987654321"));
            students.add(new Student("Lê Văn C", 21, "c@email.com", "0123456780"));
            
            batchInsertStudents(students);
            
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Không tìm thấy JDBC driver: " + e.getMessage());
        }
    }
}
```

## 🎮 Challenge

### **Challenge 1: Tạo form nhập liệu với GUI**
Sử dụng Swing để tạo form nhập thông tin sinh viên:
- TextField cho tên, email, phone
- Spinner cho tuổi
- Button để lưu và xóa form
- Validation real-time

### **Challenge 2: Import từ file CSV**
Tạo chương trình đọc file CSV và import dữ liệu vào database:
```java
public class CSVImport {
    public static void importFromCSV(String filename) {
        // Đọc file CSV
        // Parse dữ liệu
        // Insert vào database
    }
}
```

## 📝 Best Practices

### **1. Connection Management**
```java
// Sử dụng try-with-resources
try (Connection conn = getConnection();
     PreparedStatement pstmt = conn.prepareStatement(sql)) {
    // Code here
}
```

### **2. PreparedStatement**
```java
// Tránh SQL injection
String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, name);
pstmt.setInt(2, age);
```

### **3. Transaction Management**
```java
conn.setAutoCommit(false);
try {
    // Multiple operations
    conn.commit();
} catch (SQLException e) {
    conn.rollback();
    throw e;
}
```

### **4. Error Handling**
```java
try {
    // Database operations
} catch (SQLException e) {
    logger.error("Database error: " + e.getMessage());
    // Handle specific error codes
    switch (e.getErrorCode()) {
        case 1062: // Duplicate entry
            System.out.println("Dữ liệu đã tồn tại!");
            break;
        case 1452: // Foreign key constraint
            System.out.println("Dữ liệu tham chiếu không tồn tại!");
            break;
        default:
            System.out.println("Lỗi database: " + e.getMessage());
    }
}
```

## 🔧 Configuration

### **Database Properties**
```properties
# database.properties
db.url=jdbc:mysql://localhost:3306/student_management
db.username=root
db.password=your_password
db.driver=com.mysql.cj.jdbc.Driver
```

### **Connection Pool**
```java
// Sử dụng HikariCP
HikariConfig config = new HikariConfig();
config.setJdbcUrl("jdbc:mysql://localhost:3306/student_management");
config.setUsername("root");
config.setPassword("your_password");
config.setMaximumPoolSize(10);

HikariDataSource dataSource = new HikariDataSource(config);
```

## 🎯 Checklist Hoàn Thành

- [ ] Cài đặt MySQL và JDBC driver
- [ ] Tạo database và bảng
- [ ] Kết nối database thành công
- [ ] Thực hiện INSERT cơ bản
- [ ] Sử dụng PreparedStatement
- [ ] Thêm validation cho dữ liệu
- [ ] Thực hiện batch insert
- [ ] Xử lý ngoại lệ database
- [ ] Hoàn thành challenges

## 📚 Tài Liệu Tham Khảo

- [JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)
- [MySQL Connector/J](https://dev.mysql.com/doc/connector-j/8.0/en/)
- [HikariCP Connection Pool](https://github.com/brettwooldridge/HikariCP)

---

**Chúc bạn thành công với JDBC! 🚀**
