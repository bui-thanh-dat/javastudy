# 📘 BÀI TẬP OOP – JAVA CORE

---

## 🧩 Câu 1 (2 điểm)
### Tạo lớp trừu tượng `Person`

**Thuộc tính:**
- `name` (String): Họ tên
- `ns` (int): Năm sinh

**Phương thức:**
- `void nhap()` : Nhập thông tin từ bàn phím  
- `void in()` : In thông tin ra màn hình  
- `abstract double tinhLuong()` : Tính lương  

---

## 🧩 Câu 2 (3 điểm)
### Tạo lớp `Worker` kế thừa `Person`

**Thuộc tính riêng:**
- `bac` (int): Bậc
- `soNgayCong` (int): Số ngày công

**Ghi đè các phương thức:**
- `nhap()`
- `in()`
- `tinhLuong()`

**Công thức lương:**
```text
Lương = soNgayCong * 250000 + bac * 500000
🧩 Câu 3 (3 điểm)
Tạo lớp Manager kế thừa Person

Thuộc tính riêng:

phuCap (double): Phụ cấp

Ghi đè các phương thức:

nhap()

in()

tinhLuong()

Công thức lương:

Lương = phuCap + 20000000

🧩 Câu 4 (2 điểm)
Tạo lớp CONGTY

Thuộc tính:

ArrayList<Person> ds

Phương thức:

🔹 void nhap()

Nhập số lượng nhân sự

Với mỗi người, hỏi loại:

1: Worker

2: Manager

Thêm đối tượng vào danh sách

🔹 void in()

In danh sách nhân sự

In lương của từng người

🔹 double tongLuong()

Tính tổng lương toàn công ty

🧩 Câu 5 (Bonus +1 điểm)

In ra người có lương cao nhất

📌 YÊU CẦU CHẤM ĐIỂM (RẤT QUAN TRỌNG)

Sử dụng ArrayList<Person>

Áp dụng đa hình:

Person p = new Worker();


Không dùng if để tính lương

Code chạy được


---

## ✅ CÁI NÀY ĐÚNG CHUẨN GÌ?
- ✔ Chuẩn README GitHub
- ✔ Đúng format bài thi Java OOP
- ✔ Giảng viên / người chấm đọc là hiểu ngay
- ✔ Thể hiện rõ **đa hình – kế thừa – abstraction**

---

## 👉 GỢI Ý NÂNG ĐIỂM (RẤT HAY)
Bạn có thể thêm cuối README:

```md
## 🧠 Ghi chú OOP
- Phương thức `tinhLuong()` được xử lý bằng **đa hình**
- Lớp `CONGTY` không cần biết đối tượng là `Worker` hay `Manager`
