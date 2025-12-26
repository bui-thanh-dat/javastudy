# BÀI TẬP OOP JAVA – QUẢN LÝ ĐỘNG VẬT (ANIMAL LIST)

## Mục tiêu
- Luyện tập **kế thừa (inheritance)**
- **Lớp trừu tượng (abstract class)**
- **Ghi đè phương thức (override)**
- **Đa hình (polymorphism)**
- Quản lý danh sách bằng `ArrayList`

---

## Câu 1 (2 điểm): Lớp trừu tượng `Animal`

Tạo **lớp trừu tượng** `Animal` gồm:

### Thuộc tính (protected):
- `name` (String): tên động vật
- `age` (int): tuổi

### Phương thức:
- `void input()`  
  → Nhập thông tin từ bàn phím
- `void output()`  
  → In thông tin ra màn hình
- `abstract String sound()`  
  → Trả về tiếng kêu của động vật

---

## Câu 2 (2 điểm): Lớp `Dog`

Tạo lớp `Dog` **kế thừa từ `Animal`**:

### Thuộc tính riêng:
- `breed` (String): giống chó

### Yêu cầu:
- Ghi đè `input()` và `output()`
- Ghi đè `sound()`  
  → Trả về chuỗi: `"Gâu gâu"`

---

## Câu 3 (2 điểm): Lớp `Cat`

Tạo lớp `Cat` **kế thừa từ `Animal`**:

### Thuộc tính riêng:
- `color` (String): màu lông

### Yêu cầu:
- Ghi đè `input()` và `output()`
- Ghi đè `sound()`  
  → Trả về chuỗi: `"Meo meo"`

---

## Câu 4 (2 điểm): Lớp `AnimalList`

Tạo lớp `AnimalList` để quản lý danh sách động vật:

### Thuộc tính:
- `ArrayList<Animal> list`

### Phương thức:
- `void addAnimal(Animal a)`  
  → Thêm một động vật vào danh sách
- `void showAll()`  
  → Hiển thị thông tin tất cả động vật trong danh sách
- `void showSounds()`  
  → In ra tiếng kêu của từng động vật (sử dụng đa hình)

---

## Câu 5 (2 điểm): Lớp `Main`

Viết chương trình chính `Main` thực hiện:

1. Nhập số lượng động vật
2. Với mỗi động vật:
   - Chọn loại:
     - `1` – Dog
     - `2` – Cat
   - Nhập thông tin tương ứng
3. Thêm động vật vào `AnimalList`
4. In:
   - Danh sách động vật
   - Tiếng kêu của từng động vật

---

## Yêu cầu kỹ thuật
- Sử dụng **abstract class**
- Không dùng `instanceof` để gọi `sound()`
- Áp dụng **đa hình**
- Code rõ ràng, đúng chuẩn Java

---

## Ví dụ chạy chương trình

Nhập số lượng động vật: 2
Chọn loại (1-Dog, 2-Cat): 1
Nhập tên: Vàng
Nhập tuổi: 3
Nhập giống chó: Husky

Chọn loại (1-Dog, 2-Cat): 2
Nhập tên: Mun
Nhập tuổi: 2
Nhập màu lông: Đen

--- DANH SÁCH ĐỘNG VẬT ---
Tên: Vàng | Tuổi: 3 | Giống: Husky
Tên: Mun | Tuổi: 2 | Màu lông: Đen

--- TIẾNG KÊU ---
Gâu gâu
Meo meo
