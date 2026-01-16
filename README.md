Dưới đây là **1 đề tài BÀI TẬP LỚN OOP bằng Java Core** thường được dùng cho sinh viên năm 2–3. Đề này đủ lớn để áp dụng **OOP đầy đủ** (kế thừa, đa hình, đóng gói, abstraction), nhưng vẫn phù hợp Java Core (không cần Spring).

---

# 📌 BÀI TẬP LỚN OOP – JAVA CORE

## **HỆ THỐNG QUẢN LÝ THƯ VIỆN**

---

## 🎯 Mục tiêu

* Áp dụng **lập trình hướng đối tượng (OOP)** trong Java
* Rèn luyện:

  * Class & Object
  * Encapsulation
  * Inheritance
  * Polymorphism
  * Abstraction (abstract class / interface)
* Làm việc với:

  * Collection (`ArrayList`)
  * Exception
  * File I/O (nâng cao – tùy chọn)

---

## 🧩 Mô tả bài toán

Xây dựng chương trình **quản lý thư viện** cho phép:

* Quản lý sách
* Quản lý người dùng
* Thực hiện mượn / trả sách
* Thống kê và tìm kiếm

Chương trình chạy **Console (Terminal)**.

---

## 🧱 Yêu cầu thiết kế OOP

### 1️⃣ Lớp trừu tượng `model.Person`

```java
public abstract class model.Person {
    protected String id;
    protected String name;

    public abstract void displayInfo();
}
```

---

### 2️⃣ Các lớp kế thừa từ `model.Person`

#### `model.Student`

* Thuộc tính:

  * `studentId`
  * `className`
* Có thể mượn tối đa **3 cuốn sách**

#### `model.Teacher`

* Thuộc tính:

  * `teacherId`
  * `department`
* Có thể mượn tối đa **5 cuốn sách**

➡️ Áp dụng **đa hình** khi hiển thị thông tin.

---

### 3️⃣ Lớp `Book`

* Thuộc tính:

  * `bookId`
  * `title`
  * `author`
  * `quantity`
* Phương thức:

  * `isAvailable()`
  * `displayInfo()`

---

### 4️⃣ Interface `util.Borrowable`

```java
public interface util.Borrowable {
    boolean borrowBook(Book book);
    boolean returnBook(Book book);
}
```

➡️ `model.Student` và `model.Teacher` **implements util.Borrowable**

---

### 5️⃣ Lớp `service.Library`

Quản lý toàn bộ hệ thống

* Danh sách:

  * `ArrayList<Book>`
  * `ArrayList<model.Person>`
* Chức năng:

  * Thêm / xóa / sửa sách
  * Thêm người dùng
  * Cho mượn sách
  * Trả sách
  * Tìm sách theo tên / tác giả
  * Hiển thị danh sách đang mượn

---

## 🖥️ Menu chương trình (Console)

```text
===== LIBRARY MANAGEMENT SYSTEM =====
1. Thêm sách
2. Hiển thị danh sách sách
3. Thêm người dùng
4. Mượn sách
5. Trả sách
6. Tìm kiếm sách
7. Thoát
```

---

## ⚠️ Yêu cầu xử lý Exception

* Không cho mượn khi:

  * Sách đã hết
  * Vượt quá số lượng mượn tối đa
* Xử lý nhập sai dữ liệu (`InputMismatchException`)

---

## ⭐ Nâng cao (cộng điểm)

* Lưu dữ liệu sách & người dùng vào file `.txt`
* Đếm số lượt mượn của mỗi sách
* Sắp xếp sách theo số lượt mượn
* Áp dụng `enum` cho loại người dùng

---

## 📦 Yêu cầu nộp bài

* Code Java đầy đủ
* Sơ đồ UML (class diagram)
* File báo cáo:

  * Mô tả bài toán
  * Thiết kế OOP
  * Hướng dẫn chạy chương trình

---

## 🧠 Gợi ý cấu trúc thư mục

```text
src/
 ├── model/
 │    ├── model.Person.java
 │    ├── model.Student.java
 │    ├── model.Teacher.java
 │    ├── Book.java
 ├── service/
 │    └── service.Library.java
 ├── util/
 │    └── util.Borrowable.java
 └── Main.java
```
