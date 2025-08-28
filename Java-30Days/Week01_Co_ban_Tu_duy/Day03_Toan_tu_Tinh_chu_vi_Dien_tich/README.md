# 🔢 Day 03: Toán Tử, Tính Chu Vi và Diện Tích

## 🎯 Mục Tiêu Hôm Nay

- Hiểu và sử dụng các loại toán tử trong Java
- Thực hành tính toán chu vi, diện tích các hình học
- Làm quen với Math class và các hàm toán học
- Xây dựng máy tính đơn giản
- Áp dụng toán tử vào bài toán thực tế

## 📚 Kiến Thức Cần Nắm

### **1. Các loại toán tử**

#### **Toán tử số học (Arithmetic Operators)**
```java
int a = 10, b = 3;
int sum = a + b;      // Cộng: 13
int diff = a - b;     // Trừ: 7
int product = a * b;  // Nhân: 30
int quotient = a / b; // Chia: 3
int remainder = a % b; // Chia lấy dư: 1
```

#### **Toán tử gán (Assignment Operators)**
```java
int x = 5;
x += 3;  // x = x + 3 (8)
x -= 2;  // x = x - 2 (6)
x *= 4;  // x = x * 4 (24)
x /= 3;  // x = x / 3 (8)
x %= 5;  // x = x % 5 (3)
```

#### **Toán tử so sánh (Comparison Operators)**
```java
int a = 5, b = 3;
boolean result1 = a > b;   // true
boolean result2 = a < b;   // false
boolean result3 = a >= b;  // true
boolean result4 = a <= b;  // false
boolean result5 = a == b;  // false
boolean result6 = a != b;  // true
```

#### **Toán tử logic (Logical Operators)**
```java
boolean x = true, y = false;
boolean and = x && y;  // AND: false
boolean or = x || y;   // OR: true
boolean not = !x;      // NOT: false
```

### **2. Math Class**
```java
double pi = Math.PI;           // 3.14159...
double e = Math.E;             // 2.71828...
int max = Math.max(10, 20);    // 20
int min = Math.min(10, 20);    // 10
double sqrt = Math.sqrt(16);   // 4.0
double power = Math.pow(2, 3); // 8.0
double round = Math.round(3.6); // 4.0
double ceil = Math.ceil(3.2);  // 4.0
double floor = Math.floor(3.8); // 3.0
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Tính chu vi và diện tích hình tròn**
```java
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH CHU VI VÀ DIỆN TÍCH HÌNH TRÒN ===");
        
        // Nhập bán kính
        System.out.print("Nhập bán kính (cm): ");
        double radius = scanner.nextDouble();
        
        // Tính chu vi và diện tích
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        
        // Hiển thị kết quả
        System.out.println("\n=== KẾT QUẢ ===");
        System.out.printf("Bán kính: %.2f cm\n", radius);
        System.out.printf("Chu vi: %.2f cm\n", circumference);
        System.out.printf("Diện tích: %.2f cm²\n", area);
        
        scanner.close();
    }
}
```

### **Bài 2: Tính chu vi và diện tích hình chữ nhật**
```java
import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH CHU VI VÀ DIỆN TÍCH HÌNH CHỮ NHẬT ===");
        
        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài (cm): ");
        double length = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng (cm): ");
        double width = scanner.nextDouble();
        
        // Tính chu vi và diện tích
        double perimeter = 2 * (length + width);
        double area = length * width;
        
        // Hiển thị kết quả
        System.out.println("\n=== KẾT QUẢ ===");
        System.out.printf("Chiều dài: %.2f cm\n", length);
        System.out.printf("Chiều rộng: %.2f cm\n", width);
        System.out.printf("Chu vi: %.2f cm\n", perimeter);
        System.out.printf("Diện tích: %.2f cm²\n", area);
        
        scanner.close();
    }
}
```

### **Bài 3: Tính chu vi và diện tích hình tam giác**
```java
import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH CHU VI VÀ DIỆN TÍCH HÌNH TAM GIÁC ===");
        
        // Nhập 3 cạnh của tam giác
        System.out.print("Nhập cạnh a (cm): ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập cạnh b (cm): ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập cạnh c (cm): ");
        double c = scanner.nextDouble();
        
        // Kiểm tra tam giác hợp lệ
        if (isValidTriangle(a, b, c)) {
            // Tính chu vi
            double perimeter = a + b + c;
            
            // Tính diện tích bằng công thức Heron
            double s = perimeter / 2; // Nửa chu vi
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            // Hiển thị kết quả
            System.out.println("\n=== KẾT QUẢ ===");
            System.out.printf("Cạnh a: %.2f cm\n", a);
            System.out.printf("Cạnh b: %.2f cm\n", b);
            System.out.printf("Cạnh c: %.2f cm\n", c);
            System.out.printf("Chu vi: %.2f cm\n", perimeter);
            System.out.printf("Diện tích: %.2f cm²\n", area);
        } else {
            System.out.println("❌ Ba cạnh không tạo thành tam giác hợp lệ!");
        }
        
        scanner.close();
    }
    
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b) && (a > 0) && (b > 0) && (c > 0);
    }
}
```

### **Bài 4: Máy tính đơn giản**
```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MÁY TÍNH ĐƠN GIẢN ===");
        
        // Nhập hai số
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        // Hiển thị menu
        System.out.println("\nChọn phép toán:");
        System.out.println("1. Cộng (+)");
        System.out.println("2. Trừ (-)");
        System.out.println("3. Nhân (*)");
        System.out.println("4. Chia (/)");
        System.out.println("5. Chia lấy dư (%)");
        System.out.println("6. Lũy thừa (^)");
        
        System.out.print("Nhập lựa chọn (1-6): ");
        int choice = scanner.nextInt();
        
        // Thực hiện phép toán
        double result = 0;
        String operation = "";
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                operation = "+";
                break;
            case 2:
                result = num1 - num2;
                operation = "-";
                break;
            case 3:
                result = num1 * num2;
                operation = "*";
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    operation = "/";
                } else {
                    System.out.println("❌ Không thể chia cho 0!");
                    scanner.close();
                    return;
                }
                break;
            case 5:
                result = num1 % num2;
                operation = "%";
                break;
            case 6:
                result = Math.pow(num1, num2);
                operation = "^";
                break;
            default:
                System.out.println("❌ Lựa chọn không hợp lệ!");
                scanner.close();
                return;
        }
        
        // Hiển thị kết quả
        System.out.printf("\n=== KẾT QUẢ ===\n");
        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operation, num2, result);
        
        scanner.close();
    }
}
```

## 🎮 Challenge

### **Challenge 1: Tính diện tích hình phức tạp**
Tạo chương trình tính diện tích các hình phức tạp:
- Hình thang
- Hình bình hành
- Hình thoi
- Hình elip

### **Challenge 2: Máy tính khoa học**
Tạo máy tính có các chức năng:
- Các phép toán cơ bản
- Căn bậc hai, căn bậc ba
- Sin, cos, tan
- Logarit
- Giai thừa

### **Challenge 3: Tính thể tích các hình khối**
```java
public class VolumeCalculator {
    public static void main(String[] args) {
        // Tính thể tích:
        // - Hình cầu: V = (4/3) * π * r³
        // - Hình trụ: V = π * r² * h
        // - Hình hộp chữ nhật: V = l * w * h
        // - Hình chóp: V = (1/3) * S * h
    }
}
```

## 📝 Kiến Thức Nâng Cao

### **1. Toán tử tăng/giảm**
```java
int x = 5;
int y = ++x;  // x = 6, y = 6 (tăng trước)
int z = x++;  // z = 6, x = 7 (tăng sau)
int w = --x;  // x = 6, w = 6 (giảm trước)
int v = x--;  // v = 6, x = 5 (giảm sau)
```

### **2. Toán tử bitwise**
```java
int a = 5;  // 101 in binary
int b = 3;  // 011 in binary

int and = a & b;   // 001 (1)
int or = a | b;    // 111 (7)
int xor = a ^ b;   // 110 (6)
int not = ~a;      // -6 (complement)
int leftShift = a << 1;   // 1010 (10)
int rightShift = a >> 1;  // 010 (2)
```

### **3. Toán tử điều kiện (Ternary)**
```java
int age = 20;
String status = (age >= 18) ? "Người lớn" : "Trẻ em";
// Tương đương với:
// String status;
// if (age >= 18) {
//     status = "Người lớn";
// } else {
//     status = "Trẻ em";
// }
```

## 🔧 Best Practices

### **1. Sử dụng Math class**
```java
// Tốt
double area = Math.PI * Math.pow(radius, 2);

// Không tốt
double area = 3.14159 * radius * radius;
```

### **2. Kiểm tra điều kiện hợp lệ**
```java
// Luôn kiểm tra điều kiện trước khi tính toán
if (radius > 0) {
    double area = Math.PI * Math.pow(radius, 2);
} else {
    System.out.println("Bán kính phải lớn hơn 0!");
}
```

### **3. Format kết quả**
```java
// Sử dụng printf để format số thập phân
System.out.printf("Diện tích: %.2f cm²\n", area);
```

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu các loại toán tử trong Java
- [ ] Sử dụng Math class thành thạo
- [ ] Tính được chu vi, diện tích hình tròn
- [ ] Tính được chu vi, diện tích hình chữ nhật
- [ ] Tính được chu vi, diện tích hình tam giác
- [ ] Xây dựng máy tính đơn giản
- [ ] Hiểu toán tử tăng/giảm và bitwise
- [ ] Hoàn thành challenges
- [ ] Áp dụng best practices

## 📚 Tài Liệu Tham Khảo

- [Java Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
- [Java Math Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html)
- [Java Number Formatting](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

---

**Chúc bạn thành công với toán tử và tính toán! 🚀**
