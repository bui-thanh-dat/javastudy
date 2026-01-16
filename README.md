# 🎓 BÀI TẬP LỚN JAVA CORE (OFFICIAL EXAM)
## Đề bài: XÂY DỰNG HỆ THỐNG QUẢN LÝ THUÊ XE (VEHICLE RENTAL SYSTEM)

---

### 🎯 Mục tiêu
Đánh giá toàn diện kiến thức Java Core:
1.  **OOP (Lập trình hướng đối tượng)**: Kế thừa (Inheritance), Đa hình (Polymorphism), Trừu tượng (Abstraction), Đóng gói (Encapsulation).
2.  **Java Collections Framework**: `ArrayList`, `HashMap`, `HashSet`, `Comparator`.
3.  **Exception Handling**: Xử lý ngoại lệ (Try-catch, Custom Exception).
4.  **File I/O**: Đọc ghi file (IO Stream / NIO).
5.  **Java 8+ Features**: Lambda Expressions, Stream API.
6.  **Clean Code & Architecture**: Tổ chức code theo mô hình lớp (Layered).

---

### 📝 Mô tả bài toán
Một công ty cho thuê phương tiện cần quản lý các loại xe và hợp đồng cho thuê. Hệ thống cần quản lý được 2 loại phương tiện chính: **Xe máy (Motorbike)** và **Xe tải (Truck)**.

#### 1. Yêu cầu về OOP (Model)

**Lớp trừu tượng `Vehicle`**:
- Thuộc tính:
    - `String id` (Biển số xe - duy nhất)
    - `String brand` (Hãng sản xuất)
    - `int year` (Năm sản xuất)
    - `String color` (Màu sắc)
    - `double baseRentPrice` (Giá thuê cơ bản/ngày)
- Phương thức abstract: `double calculateDailyRent()` (Tính giá thuê thực tế).
- Phương thức: `displayInfo()`.

**Lớp `Motorbike` (Kế thừa `Vehicle`)**:
- Thuộc tính riêng:
    - `int capacity` (Dung tích - cc).
- Override `calculateDailyRent()`:
    - Nếu dung tích < 150cc: `baseRentPrice`.
    - Nếu dung tích >= 150cc: `baseRentPrice * 1.5`.

**Lớp `Truck` (Kế thừa `Vehicle`)**:
- Thuộc tính riêng:
    - `double loadWeight` (Trọng tải - tấn).
- Override `calculateDailyRent()`:
    - Giá thuê = `baseRentPrice + (loadWeight * 200.000)`.

**Interface `Maintainable`**:
- Phương thức: `void performMaintenance()`.
- `Truck` phải implement interface này (Xe tải cần bảo trì định kỳ). `Motorbike` không bắt buộc.

---

#### 2. Yêu cầu về Quản lý (Service Logic)

Lớp `RentalManager` (hoặc `VehicleService`) thực hiện các chức năng:

1.  **Thêm phương tiện mới**:
    - Kiểm tra trùng mã (biển số). Nếu trùng ném ra ngoại lệ `DuplicateIDException`.
    - Kiểm tra dữ liệu đầu vào (ví dụ: năm sản xuất không được lớn hơn năm hiện tại).
2.  **Tìm kiếm phương tiện**:
    - Tìm theo Hãng (Brand) (Dùng Stream API filter).
    - Tìm theo Mã (ID).
3.  **Cho thuê xe (Booking)**:
    - Nhập vào `Customer ID` và `Vehicle ID`.
    - Kiểm tra xe có sẵn không (Có thể thêm thuộc tính `boolean isRented` trong `Vehicle`).
    - Nếu xe đã thuê, ném ngoại lệ `VehicleUnavailableException`.
4.  **Trả xe & Tính tiền**:
    - Nhập vào số ngày thuê.
    - Tính tổng tiền = `calculateDailyRent() * days`.
5.  **Sắp xếp danh sách**:
    - Sắp xếp xe theo Giá thuê giảm dần (Dùng `Comparator` & Lambda).
    - Sắp xếp xe theo Tên hãng (Alphabet).

---

#### 3. Yêu cầu về Lưu trữ (File I/O) (Bắt buộc)
- Khi chương trình tắt, tự động lưu danh sách xe vào file `vehicles.csv`.
- Khi chương trình mở lên, tự động đọc dữ liệu từ `vehicles.csv` để nạp vào chương trình.
- Format CSV ví dụ: `Type,ID,Brand,Year,Color,Price,ExtraParam`
  - `Motorbike,29-A1,Honda,2022,Red,100000,125`
  - `Truck,50-C2,Hyundai,2020,Blue,500000,3.5`

---

#### 4. Menu Chương trình (Console)
```text
=== VEHICLE RENTAL SYSTEM ===
1. Add new vehicle (Motorbike/Truck)
2. Show all vehicles
3. Search vehicle by Brand
4. Rent a vehicle
5. Return a vehicle & Calculate fee
6. Sort vehicles by Price
7. Save & Exit
```

---

### 🚧 Yêu cầu kỹ thuật chi tiết
1.  **Custom Exceptions**:
    - Tạo `DuplicateIDException`.
    - Tạo `VehicleUnavailableException`.
2.  **Validate dữ liệu**:
    - Biển số xe phải đúng định dạng (dùng Regex - VD: có chứa ký tự và số).
3.  **Cấu trúc thư mục**:
    ```
    src/
     ├── model/          (Vehicle, Motorbike, Truck)
     ├── service/        (RentalService, IService)
     ├── util/           (FileHelper, Validator, Formatter)
     ├── exception/      (Custom exceptions)
     └── Main.java
    ```

### 🌟 Điểm cộng (Bonus)
- Sử dụng **Singleton Pattern** cho lớp quản lý `RentalService`.
- Tạo chức năng **Lịch sử thuê xe** (Ghi log mỗi lần thuê/trả vào file `history.txt`).
- Sử dụng **Generics** để viết hàm tìm kiếm/sắp xếp chung.

---
**Chúc bạn hoàn thành tốt bài kiểm tra!**
