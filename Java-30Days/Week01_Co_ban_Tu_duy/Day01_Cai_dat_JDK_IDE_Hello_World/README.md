# 🌟 Day 01: Cài Đặt JDK, IDE và Hello World

## 🎯 Mục Tiêu Hôm Nay

- Cài đặt môi trường phát triển Java
- Hiểu cú pháp cơ bản của Java
- Viết chương trình Hello World đầu tiên
- Làm quen với IDE và cách chạy chương trình

## 📋 Kiến Thức Cần Nắm

### **1. Java là gì?**
- Ngôn ngữ lập trình hướng đối tượng
- "Write Once, Run Anywhere" (WORA)
- Được phát triển bởi Sun Microsystems (nay là Oracle)

### **2. JDK vs JRE vs JVM**
- **JVM (Java Virtual Machine)**: Máy ảo chạy bytecode
- **JRE (Java Runtime Environment)**: Môi trường runtime
- **JDK (Java Development Kit)**: Bộ công cụ phát triển (bao gồm JRE)

### **3. Cú pháp cơ bản**
```java
public class TenClass {
    public static void main(String[] args) {
        // Code ở đây
    }
}
```

## 🛠️ Cài Đặt Môi Trường

### **Bước 1: Tải JDK**
1. Truy cập [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
2. Chọn phiên bản phù hợp với hệ điều hành
3. Tải và cài đặt

### **Bước 2: Cài đặt IDE**
**Lựa chọn 1: IntelliJ IDEA**
- Tải [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)
- Cài đặt và tạo project đầu tiên

**Lựa chọn 2: Eclipse**
- Tải [Eclipse IDE](https://www.eclipse.org/downloads/)
- Cài đặt và tạo workspace

**Lựa chọn 3: VS Code**
- Tải [Visual Studio Code](https://code.visualstudio.com/)
- Cài đặt extension Java Extension Pack

### **Bước 3: Kiểm tra cài đặt**
```bash
java -version
javac -version
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Hello World**
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### **Bài 2: Giới thiệu bản thân**
```java
public class Introduction {
    public static void main(String[] args) {
        System.out.println("Xin chào! Tôi là [Tên của bạn]");
        System.out.println("Tôi đang học Java");
        System.out.println("Rất vui được gặp bạn!");
    }
}
```

### **Bài 3: In thông tin cá nhân**
```java
public class PersonalInfo {
    public static void main(String[] args) {
        String name = "Nguyễn Văn A";
        int age = 20;
        String school = "Đại học ABC";
        
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Trường: " + school);
    }
}
```

## 🎮 Challenge

### **Challenge 1: Tạo chương trình giới thiệu chi tiết**
- Nhập thông tin cá nhân
- In ra thông tin được format đẹp
- Thêm các thông tin khác như sở thích, mục tiêu

### **Challenge 2: Tạo menu đơn giản**
```java
public class SimpleMenu {
    public static void main(String[] args) {
        System.out.println("=== MENU ===");
        System.out.println("1. Giới thiệu bản thân");
        System.out.println("2. Hiển thị thông tin liên hệ");
        System.out.println("3. Thoát");
        System.out.println("============");
    }
}
```

## 📝 Ghi Chú Quan Trọng

### **Quy tắc đặt tên:**
- Tên class: PascalCase (ViếtHoaChữCáiĐầu)
- Tên method: camelCase (viếtThườngChữCáiĐầu)
- Tên biến: camelCase
- Tên hằng: UPPER_CASE

### **Cấu trúc file Java:**
- Mỗi file `.java` chỉ có 1 class public
- Tên file phải trùng với tên class public
- File phải có extension `.java`

### **Comments:**
```java
// Comment một dòng
/* Comment nhiều dòng */
/** JavaDoc comment */
```

## 🔧 Troubleshooting

### **Lỗi thường gặp:**
1. **"javac is not recognized"**: Chưa cài JDK hoặc chưa set PATH
2. **"public class must be in its own file"**: Tên file không khớp với tên class
3. **"cannot find symbol"**: Lỗi cú pháp, thiếu dấu chấm phẩy

### **Cách khắc phục:**
1. Kiểm tra biến môi trường PATH
2. Restart IDE sau khi cài đặt
3. Kiểm tra cú pháp và tên file

## 📚 Tài Liệu Tham Khảo

- [Java Tutorial - Getting Started](https://docs.oracle.com/javase/tutorial/getStarted/)
- [IntelliJ IDEA Tutorial](https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html)
- [Eclipse Tutorial](https://www.eclipse.org/documentation/)

## 🎯 Checklist Hoàn Thành

- [ ] Cài đặt JDK thành công
- [ ] Cài đặt IDE thành công
- [ ] Chạy được chương trình Hello World
- [ ] Hiểu cú pháp cơ bản của Java
- [ ] Hoàn thành các bài tập thực hành
- [ ] Thử sức với challenge

---

**Chúc bạn có một ngày học tập hiệu quả! 🚀**
