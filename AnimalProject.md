# 📘 ĐỀ LUYỆN TẬP FINAL EXAM – JAVA OOP

## ⏱ Thời gian làm bài: 90 phút  
## 💯 Tổng điểm: 10 điểm

---

## **Câu 1 (2 điểm)**  
Tạo **lớp trừu tượng** `Animal` gồm:

### Thuộc tính (protected):
- `id` (String): mã động vật  
- `name` (String): tên động vật  
- `age` (int): tuổi  

### Phương thức:
- `void input()` : nhập thông tin từ bàn phím  
- `void output()` : in thông tin ra màn hình  
- `abstract double getFoodCost()` : tính chi phí thức ăn  

---

## **Câu 2 (3 điểm)**  
Tạo lớp `Dog` **kế thừa** từ `Animal`, gồm:

### Thuộc tính riêng:
- `weight` (double): cân nặng (kg)  

### Ghi đè các phương thức:
- `input()`  
- `output()`  
- `getFoodCost()`

### Công thức tính chi phí thức ăn:
Chi phí = weight * 15000

---

## **Câu 3 (3 điểm)**  
Tạo lớp `Cat` **kế thừa** từ `Animal`, gồm:

### Thuộc tính riêng:
- `isIndoor` (boolean): mèo nuôi trong nhà hay không  

### Ghi đè các phương thức:
- `input()`  
- `output()`  
- `getFoodCost()`

### Quy tắc tính chi phí:
- Nếu mèo nuôi trong nhà → 120000  
- Nếu mèo nuôi ngoài trời → 80000  

---

## **Câu 4 (1 điểm)**  
Tạo lớp `AnimalList` gồm:

### Thuộc tính:
- `ArrayList<Animal> list`

### Phương thức:
- `void addAnimal()` :  
  - Nhập loại động vật (1 - Dog, 2 - Cat)  
  - Tạo đối tượng tương ứng và thêm vào danh sách  

- `void showAll()` : hiển thị thông tin **tất cả động vật**

---

## **Câu 5 (1 điểm)**  
Trong lớp `AnimalList`, viết phương thức:

double totalFoodCost()
👉 Tính **tổng chi phí thức ăn của tất cả động vật**

---

## **Yêu cầu chung (rất quan trọng khi thi)**

- Áp dụng **đa hình** (`Animal a = new Dog()` / `Cat()`)  
- **KHÔNG dùng instanceof**  
- Không dùng if–else để gọi `getFoodCost()`  
- Dùng `Scanner` để nhập dữ liệu  
- Code đúng chuẩn OOP  

---

## 📌 Gợi ý cấu trúc chương trình
Animal (abstract)
↑
Dog Cat

AnimalList
Main
