# 🏗️ Day 08: Class, Object và model.Student

## 🎯 Mục Tiêu Hôm Nay

- Hiểu khái niệm Class và Object trong OOP
- Tạo class đầu tiên với các thuộc tính và phương thức
- Thực hành với class model.Student
- Nắm vững các nguyên tắc cơ bản của OOP

## 📚 Kiến Thức Cần Nắm

### **1. Object-Oriented Programming (OOP)**
OOP là một paradigm lập trình dựa trên khái niệm "objects" chứa data và code.

### **2. Class vs Object**
- **Class**: Template/blueprint để tạo objects
- **Object**: Instance (thể hiện) của class

**Ví dụ:**
```java
// Class - khuôn mẫu
class Car {
    String brand;
    String color;
    int year;
}

// Object - sản phẩm từ khuôn
Car myCar = new Car();
```

### **3. Cấu trúc Class cơ bản**
```java
public class TenClass {
    // Thuộc tính (Attributes/Fields)
    private String name;
    private int age;
    
    // Constructor
    public TenClass() {
        // Khởi tạo object
    }
    
    // Phương thức (Methods)
    public void displayInfo() {
        // Logic xử lý
    }
}
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Tạo class model.Student cơ bản**
```java
public class model.Student {
    // Thuộc tính
    String name;
    int age;
    String studentId;
    double gpa;
    
    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Mã SV: " + studentId);
        System.out.println("GPA: " + gpa);
    }
    
    // Phương thức tính điểm trung bình
    public void calculateGPA(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        gpa = sum / scores.length;
    }
}
```

### **Bài 2: Sử dụng class model.Student**

```java
import model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // Tạo object model.Student
        Student student1 = new Student();

        // Gán giá trị cho thuộc tính
        student1.name = "Nguyễn Văn A";
        student1.age = 20;
        student1.studentId = "SV001";
        student1.gpa = 3.5;

        // Gọi phương thức
        student1.displayInfo();

        // Tạo thêm object khác
        Student student2 = new Student();
        student2.name = "Trần Thị B";
        student2.age = 19;
        student2.studentId = "SV002";

        // Tính GPA
        double[] scores = {8.5, 9.0, 7.5, 8.0};
        student2.calculateGPA(scores);
        student2.displayInfo();
    }
}
```

### **Bài 3: Class Book với nhiều thuộc tính**
```java
public class Book {
    // Thuộc tính
    String title;
    String author;
    String isbn;
    int year;
    double price;
    boolean isAvailable;
    
    // Phương thức hiển thị thông tin sách
    public void displayBookInfo() {
        System.out.println("=== THÔNG TIN SÁCH ===");
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Năm xuất bản: " + year);
        System.out.println("Giá: " + price + " VNĐ");
        System.out.println("Trạng thái: " + (isAvailable ? "Có sẵn" : "Đã mượn"));
        System.out.println("=====================");
    }
    
    // Phương thức mượn sách
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Đã mượn sách: " + title);
        } else {
            System.out.println("Sách đã được mượn!");
        }
    }
    
    // Phương thức trả sách
    public void returnBook() {
        isAvailable = true;
        System.out.println("Đã trả sách: " + title);
    }
}
```

## 🎮 Challenge

### **Challenge 1: Tạo class Car**
Tạo class Car với các thuộc tính:
- brand (hãng xe)
- model (dòng xe)
- year (năm sản xuất)
- color (màu sắc)
- price (giá)
- isRunning (đang chạy hay không)

Và các phương thức:
- startEngine() - khởi động xe
- stopEngine() - tắt máy
- accelerate() - tăng tốc
- brake() - phanh
- displayInfo() - hiển thị thông tin

### **Challenge 2: Hệ thống quản lý thư viện đơn giản**
Tạo các class:
- Book (như trên)
- service.Library (quản lý danh sách sách)
- Member (thành viên thư viện)

## 📝 Kiến Thức Nâng Cao

### **1. Access Modifiers**
```java
public class Example {
    public String publicVar;      // Truy cập từ mọi nơi
    private String privateVar;    // Chỉ trong class
    protected String protectedVar; // Trong package và subclass
    String defaultVar;            // Chỉ trong package
}
```

### **2. Static vs Instance**
```java
public class Example {
    static int staticVar = 0;     // Thuộc về class
    int instanceVar = 0;          // Thuộc về object
    
    static void staticMethod() {  // Gọi: Example.staticMethod()
        // Không thể dùng this
    }
    
    void instanceMethod() {       // Gọi: obj.instanceMethod()
        // Có thể dùng this
    }
}
```

### **3. Method Overloading**
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

## 🔧 Best Practices

### **1. Naming Conventions**
- Class name: PascalCase (model.Student, Book, Car)
- Method name: camelCase (displayInfo, calculateGPA)
- Variable name: camelCase (studentName, bookTitle)
- Constant: UPPER_CASE (MAX_SIZE, PI)

### **2. Encapsulation**
```java
public class model.Student {
    private String name;  // Private để bảo vệ dữ liệu
    
    public String getName() {  // Getter
        return name;
    }
    
    public void setName(String name) {  // Setter
        this.name = name;
    }
}
```

### **3. Single Responsibility**
Mỗi class chỉ nên có một trách nhiệm duy nhất.

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu khái niệm Class và Object
- [ ] Tạo được class model.Student cơ bản
- [ ] Tạo và sử dụng objects
- [ ] Thêm phương thức cho class
- [ ] Hoàn thành challenge Car
- [ ] Hiểu access modifiers
- [ ] Thực hành method overloading

## 🔥 Bật chế độ Chiến!

- Nghĩ bằng đối tượng, viết bằng hành động.
- Mọi class tốt bắt đầu từ tên tốt.
- Tích lũy từng ví dụ nhỏ – thành hệ thống lớn.

## 📚 Tài Liệu Tham Khảo

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/)
- [Java Access Modifiers](https://www.tutorialspoint.com/java/java_access_modifiers.htm)
- [Java Method Overloading](https://www.geeksforgeeks.org/method-overloading-in-java/)

---

**Chúc bạn thành công với OOP! 🚀**
