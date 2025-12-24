# 📘 ĐỀ BÀI OOP – JAVA CORE

---

## Câu 1 (2 điểm)

Tạo lớp trừu tượng **Person** gồm:

### Thuộc tính
- `name` (String): họ tên  
- `ns` (int): năm sinh  

### Phương thức
- `void nhap()` : nhập thông tin từ bàn phím  
- `void in()` : in thông tin ra màn hình  
- `abstract double tinhLuong()` : tính lương  

---

## Câu 2 (3 điểm)

Tạo lớp **Worker** kế thừa **Person**, gồm:

### Thuộc tính riêng
- `bac` (int): bậc  
- `soNgayCong` (int): số ngày công  

### Ghi đè
- `nhap()`  
- `in()`  
- `tinhLuong()`  

### Công thức lương
Lương = soNgayCong * 250000 + bac * 500000
---

## Câu 3 (3 điểm)

Tạo lớp **Manager** kế thừa **Person**, gồm:

### Thuộc tính riêng
- `phuCap` (double)  

### Ghi đè
- `nhap()`  
- `in()`  
- `tinhLuong()`  

### Công thức lương
Lương = phuCap + 20000000
---

## Câu 4 (2 điểm)

Tạo lớp **CONGTY** gồm:

### Thuộc tính
- `ArrayList<Person> ds`  

### Phương thức

#### `void nhap()`
- Nhập số lượng nhân sự  
- Với mỗi người, hỏi loại:
  - `1`: Worker  
  - `2`: Manager  
- Thêm vào danh sách  

#### `void in()`
- In danh sách nhân sự  
- In lương của từng người  

#### `double tongLuong()`
- Tính tổng lương toàn công ty  

---

## Câu 5 (Bonus +1 điểm)

- In ra người có lương cao nhất  

---

## 📌 YÊU CẦU CHẤM ĐIỂM (rất quan trọng)

- Dùng `ArrayList<Person>`  
- Dùng đa hình (`Person p = new Worker()`)  
- Không dùng `if` để tính lương  
- Code chạy được  
