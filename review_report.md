# Code Review: Library Management System

## 1. 🐛 Critical Bugs (Lỗi Nghiêm Trọng)

### 1.1. Logic Trả Sách (Teacher.java)
- **Vị trí**: `src/Teacher.java`, dòng 36 (phương thức `returnBook`).
- **Vấn đề**: Code hiện tại gọi `book.borrowOne()` (trừ số lượng) thay vì `book.returnOne()` (cộng số lượng).
- **Hậu quả**: Khi giáo viên trả sách, số lượng sách trong kho bị giảm đi thay vì tăng lên.
- **Sửa lỗi**: Đổi thành `book.returnOne()`.

### 1.2. Chức Năng Tìm Kiếm Không Hoạt Động (Main.java)
- **Vị trí**: `src/Main.java`, case 6 (dòng 106-112).
- **Vấn đề**: Các hàm `lib.findBookByTitle(...)` được gọi nhưng giá trị trả về bị bỏ qua, không được gán vào biến nào và không được hiển thị ra màn hình.
- **Hậu quả**: Người dùng chọn tìm kiếm, nhập từ khóa, nhưng không thấy kết quả gì hiện ra.
- **Sửa lỗi**: Gán kết quả vào biến `Books resultantBook` và gọi `resultantBook.displayInfor()` (hoặc thông báo nếu null).

## 2. ⚠️ Code Quality & Conventions (Quy chuẩn Code)

### 2.1. Đặt Tên File/Class
- **File**: `Books.java`
- **Vấn đề**: Tên class nên là danh từ số ít để đại diện cho một đối tượng.
- **Đề xuất**: Đổi tên thành `Book.java`.

### 2.2. Lỗi Chính Tả (Typo)
- **Phương thức**: `displayInfor()` (trong `Person`, `Student`, `Teacher`, `Book`).
- **Vấn đề**: Dư chữ `r` ở cuối.
- **Đề xuất**: Sửa thành `displayInfo()`.

### 2.3. Nhập Liệu (Main.java)
- **Vấn đề**: Khi thêm `Student` (case 3), chương trình in "Enter Student Name" khi đang yêu cầu nhập `className` (dòng 59).
- **Đề xuất**: Sửa prompt thành "Enter Class Name".

### 2.4. Xử Lý Ngoại Lệ (Exception Handling)
- **Vấn đề**: Chưa xử lý `InputMismatchException`. Nếu người dùng nhập chữ vào chỗ yêu cầu nhập số (ví dụ menu choice), chương trình sẽ bị crash.

## 3. 🏗️ Structure (Cấu trúc Project)

### 3.1. Packages
- **Hiện tại**: Tất cả file nằm trong `src/`.
- **Đề xuất**: Chia theo mô hình MVC/Layered Architecture như yêu cầu:
  - `model`: `Book`, `Person`, `Student`, `Teacher`
  - `service`: `Library`
  - `util`: `Borrowable`
  - Root: `Main.java`

## 4. 💡 Tổng Kết & Đề Xuất

Code hiện tại đã đáp ứng được khung sườn cơ bản của bài toán OOP (Kế thừa, Đa hình, Abstract class, Interface). Tuy nhiên, các lỗi logic nghiêm trọng cần được sửa ngay để chương trình chạy đúng. Việc cấu trúc lại package sẽ giúp code gọn gàng và chuyên nghiệp hơn.

**Mức độ nghiêm trọng**: 🔴 Cao (do lỗi logic Business Logic).
**Khuyến nghị**: Refactor và Fix bugs theo kế hoạch đã đề ra.
