# 📊 Tuần 3: Dữ Liệu & Xử Lý Nâng Cao

## 🎯 Mục Tiêu Tuần Này

Tuần thứ ba sẽ giúp bạn:
- Làm chủ cấu trúc dữ liệu cơ bản và nâng cao
- Xử lý ngoại lệ một cách hiệu quả
- Thao tác với file và I/O
- Tổ chức code với package và access modifier
- Xây dựng ứng dụng xử lý dữ liệu hoàn chỉnh

## 📅 Lộ Trình Chi Tiết

### **Day 15: Array, Tìm max, Sắp xếp**
- **Kiến thức**: Array 1D, 2D, thuật toán tìm kiếm và sắp xếp
- **Thực hành**: Tìm max/min, sắp xếp bubble sort, selection sort
- **Challenge**: Implement thuật toán sắp xếp nâng cao

### **Day 16: ArrayList, Quản lý học sinh**
- **Kiến thức**: ArrayList, Collections framework
- **Thực hành**: Quản lý danh sách học sinh với ArrayList
- **Challenge**: Tạo hệ thống quản lý với nhiều loại dữ liệu

### **Day 17: HashMap, HashSet, Đếm tần suất từ**
- **Kiến thức**: HashMap, HashSet, Map interface
- **Thực hành**: Đếm tần suất xuất hiện từ trong văn bản
- **Challenge**: Tạo từ điển đơn giản

### **Day 18: Ngoại lệ, Try-Catch, Chia cho 0**
- **Kiến thức**: Exception handling, try-catch-finally
- **Thực hành**: Xử lý các ngoại lệ phổ biến
- **Challenge**: Tạo custom exception

### **Day 19: File I/O, Đọc, Ghi**
- **Kiến thức**: FileInputStream, FileOutputStream, BufferedReader
- **Thực hành**: Đọc/ghi file text, CSV
- **Challenge**: Tạo ứng dụng backup dữ liệu

### **Day 20: Package, Access Modifier, Tổ chức code**
- **Kiến thức**: Package, import, access modifier
- **Thực hành**: Tổ chức code theo package
- **Challenge**: Tạo thư viện utility

### **Day 21: Ôn tập, Todo List File**
- **Kiến thức**: Tổng hợp kiến thức tuần 3
- **Thực hành**: Ứng dụng Todo List với file storage
- **Challenge**: Mở rộng với database

## 🎮 Bài Tập Thực Hành

### **Bài tập cơ bản:**
1. Tìm số lớn nhất và nhỏ nhất trong mảng
2. Sắp xếp danh sách học sinh theo điểm
3. Đếm tần suất xuất hiện ký tự trong chuỗi
4. Đọc/ghi file cấu hình

### **Bài tập nâng cao:**
1. Hệ thống quản lý kho hàng với HashMap
2. Ứng dụng phân tích văn bản
3. Backup và restore dữ liệu
4. Tạo thư viện utility classes

## 🏆 Challenge Cuối Tuần

**Xây dựng ứng dụng "Quản lý kho hàng"**
- Sử dụng ArrayList và HashMap
- Xử lý ngoại lệ khi nhập dữ liệu
- Lưu trữ dữ liệu vào file
- Tổ chức code theo package

## 📚 Kiến Thức Trọng Tâm

### **Collections Framework:**
- **List**: ArrayList, LinkedList
- **Set**: HashSet, TreeSet
- **Map**: HashMap, TreeMap
- **Queue**: PriorityQueue

### **Exception Handling:**
```java
try {
    // Code có thể gây exception
} catch (ExceptionType e) {
    // Xử lý exception
} finally {
    // Code luôn được thực thi
}
```

### **File I/O:**
- **Text Files**: BufferedReader, BufferedWriter
- **Binary Files**: FileInputStream, FileOutputStream
- **CSV Files**: String.split(), StringBuilder

### **Package Structure:**
```
com.company.project/
├── model/
├── service/
├── util/
└── main/
```

## 📝 Best Practices

### **Collections:**
- Chọn đúng collection cho từng trường hợp
- Sử dụng generics để type safety
- Iterator để duyệt collection an toàn

### **Exception Handling:**
- Không bỏ qua exception
- Log exception để debug
- Custom exception cho business logic

### **File Operations:**
- Luôn đóng file sau khi sử dụng
- Sử dụng try-with-resources
- Validate file trước khi đọc/ghi

### **Package Design:**
- Tên package theo domain
- Separation of concerns
- Consistent naming convention

## 🔧 Công Cụ & Thư Viện

### **IDE Features:**
- Debug với breakpoints
- Code completion
- Refactoring tools

### **Useful Libraries:**
- Apache Commons IO
- Gson cho JSON
- Apache POI cho Excel

## 🔗 Tài Liệu Tham Khảo

- [Java Collections Tutorial](https://docs.oracle.com/javase/tutorial/collections/)
- [Java Exception Handling](https://www.tutorialspoint.com/java/java_exceptions.htm)
- [Java File I/O](https://docs.oracle.com/javase/tutorial/essential/io/)

---

**Chúc bạn thành công với xử lý dữ liệu! 🚀**
