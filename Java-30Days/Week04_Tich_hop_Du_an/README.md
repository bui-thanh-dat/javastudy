# 🚀 Tuần 4: Tích Hợp & Dự Án

## 🎯 Mục Tiêu Tuần Này

Tuần cuối cùng sẽ giúp bạn:
- Làm việc với cơ sở dữ liệu MySQL qua JDBC
- Tạo giao diện người dùng với Swing
- Tích hợp OOP, JDBC và Swing
- Xây dựng ứng dụng hoàn chỉnh
- Áp dụng clean code và best practices

## 📅 Lộ Trình Chi Tiết

### **Day 22: JDBC Insert MySQL**
- **Kiến thức**: JDBC basics, kết nối database, INSERT
- **Thực hành**: Tạo database, thêm dữ liệu vào bảng
- **Challenge**: Tạo form nhập liệu với validation

### **Day 23: JDBC Select MySQL**
- **Kiến thức**: SELECT queries, ResultSet, PreparedStatement
- **Thực hành**: Truy vấn và hiển thị dữ liệu
- **Challenge**: Tìm kiếm và lọc dữ liệu

### **Day 24: JDBC Update, Delete**
- **Kiến thức**: UPDATE, DELETE operations, transaction
- **Thực hành**: Cập nhật và xóa dữ liệu
- **Challenge**: Soft delete và audit trail

### **Day 25: Mini app CRUD Sinh viên**
- **Kiến thức**: Tích hợp CRUD operations
- **Thực hành**: Ứng dụng quản lý sinh viên console
- **Challenge**: Thêm tính năng tìm kiếm nâng cao

### **Day 26: Swing, Giao diện cơ bản**
- **Kiến thức**: Swing framework, JFrame, JPanel
- **Thực hành**: Tạo giao diện đơn giản
- **Challenge**: Tạo form đăng nhập

### **Day 27: Swing nâng cao, Button, Textbox, List**
- **Kiến thức**: JButton, JTextField, JList, event handling
- **Thực hành**: Form nhập liệu với validation
- **Challenge**: Tạo giao diện quản lý danh sách

### **Day 28: Tích hợp OOP, JDBC, Swing**
- **Kiến thức**: MVC pattern, kết nối UI với database
- **Thực hành**: Ứng dụng quản lý sinh viên với GUI
- **Challenge**: Thêm tính năng export/import

### **Day 29: Dự án nhỏ**
- **Kiến thức**: Tổng hợp tất cả kiến thức
- **Thực hành**: Chọn 1 trong 2 dự án:
  - Quản lý sách CRUD với database
  - Quản lý sinh viên CRUD với database
- **Challenge**: Mở rộng dự án với tính năng mới

### **Day 30: Hoàn thiện, Clean Code, Tài liệu**
- **Kiến thức**: Clean code principles, documentation
- **Thực hành**: Refactor code, viết documentation
- **Challenge**: Deploy ứng dụng và tạo user guide

## 🎮 Bài Tập Thực Hành

### **Bài tập cơ bản:**
1. Tạo database và bảng cơ bản
2. Thực hiện CRUD operations
3. Tạo giao diện Swing đơn giản
4. Kết nối UI với database

### **Bài tập nâng cao:**
1. Hệ thống quản lý thư viện hoàn chỉnh
2. Ứng dụng quản lý nhân viên
3. Hệ thống đặt hàng online
4. Quản lý trường học với nhiều module

## 🏆 Dự Án Cuối Khóa

### **Lựa chọn 1: Quản lý sách**
- Quản lý sách, tác giả, thể loại
- Mượn/trả sách
- Tìm kiếm và báo cáo
- Giao diện người dùng thân thiện

### **Lựa chọn 2: Quản lý sinh viên**
- Quản lý sinh viên, lớp, môn học
- Điểm số và xếp loại
- Báo cáo thống kê
- Export dữ liệu

## 📚 Kiến Thức Trọng Tâm

### **JDBC Architecture:**
```
Application → JDBC Driver → Database
```

### **Swing Components:**
- **Containers**: JFrame, JPanel, JDialog
- **Controls**: JButton, JTextField, JLabel
- **Lists**: JList, JComboBox, JTable
- **Layouts**: FlowLayout, BorderLayout, GridLayout

### **MVC Pattern:**
- **Model**: Data và business logic
- **View**: User interface
- **Controller**: Xử lý user input

### **Database Design:**
- Primary Key, Foreign Key
- Normalization
- Indexes
- Constraints

## 📝 Best Practices

### **Database:**
- Sử dụng PreparedStatement để tránh SQL injection
- Connection pooling cho performance
- Proper error handling
- Transaction management

### **Swing:**
- Event-driven programming
- Separation of concerns
- Responsive UI design
- Proper resource management

### **Clean Code:**
- Meaningful names
- Small functions
- Single responsibility
- DRY principle

### **Documentation:**
- JavaDoc comments
- README files
- User guides
- API documentation

## 🔧 Công Cụ & Thư Viện

### **Database:**
- MySQL Workbench
- H2 Database (embedded)
- Connection pooling (HikariCP)

### **UI Libraries:**
- FlatLaf (modern look)
- JCalendar (date picker)
- JFreeChart (charts)

### **Build Tools:**
- Maven/Gradle
- JUnit for testing
- Log4j for logging

## 🚀 Deployment

### **JAR File:**
```bash
jar cvf MyApp.jar -C bin .
java -jar MyApp.jar
```

### **Database Setup:**
- SQL scripts
- Configuration files
- Installation guide

## 🔗 Tài Liệu Tham Khảo

- [JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)
- [Swing Tutorial](https://docs.oracle.com/javase/tutorial/uiswing/)
- [Clean Code by Robert Martin](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350884)

---

**Chúc mừng bạn đã hoàn thành khóa học Java 30 ngày! 🎉**
