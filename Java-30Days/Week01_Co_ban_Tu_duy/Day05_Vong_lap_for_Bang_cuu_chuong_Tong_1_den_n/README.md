# 🔄 Day 05: Vòng Lặp For, Bảng Cửu Chương và Tổng 1 đến n

## 🎯 Mục Tiêu Hôm Nay

- Hiểu và sử dụng vòng lặp for cơ bản
- In bảng cửu chương từ 1-10
- Tính tổng các số từ 1 đến n
- Làm quen với nested loops (vòng lặp lồng nhau)
- Vẽ hình bằng ký tự với vòng lặp

## 📚 Kiến Thức Cần Nắm

### **1. Vòng lặp for cơ bản**
```java
for (khởi_tạo; điều_kiện; cập_nhật) {
    // Code thực hiện
}

// Ví dụ:
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### **2. Các thành phần của vòng lặp for**
- **Khởi tạo**: Chỉ thực hiện 1 lần ở đầu
- **Điều kiện**: Kiểm tra trước mỗi lần lặp
- **Cập nhật**: Thực hiện sau mỗi lần lặp

### **3. Nested loops (Vòng lặp lồng nhau)**
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i + "," + j + " ");
    }
    System.out.println();
}
```

### **4. Break và Continue**
```java
// Break: thoát khỏi vòng lặp
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Thoát khi i = 5
    }
    System.out.println(i);
}

// Continue: bỏ qua lần lặp hiện tại
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Bỏ qua số chẵn
    }
    System.out.println(i);
}
```

## 💻 Bài Tập Thực Hành

### **Bài 1: In bảng cửu chương từ 1-10**
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("=== BẢNG CỬU CHƯƠNG TỪ 1-10 ===");
        
        // In bảng cửu chương từ 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Bảng cửu chương " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
```

### **Bài 2: Tính tổng từ 1 đến n**
```java
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH TỔNG TỪ 1 ĐẾN N ===");
        
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("❌ Số n phải lớn hơn 0!");
        } else {
            // Cách 1: Sử dụng vòng lặp
            int sum1 = 0;
            for (int i = 1; i <= n; i++) {
                sum1 += i;
            }
            
            // Cách 2: Sử dụng công thức
            int sum2 = n * (n + 1) / 2;
            
            System.out.println("\n=== KẾT QUẢ ===");
            System.out.println("Tổng từ 1 đến " + n + " (vòng lặp): " + sum1);
            System.out.println("Tổng từ 1 đến " + n + " (công thức): " + sum2);
            
            // In chi tiết
            System.out.print("Chi tiết: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum1);
        }
        
        scanner.close();
    }
}
```

### **Bài 3: Vẽ hình chữ nhật bằng ký tự**
```java
import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VẼ HÌNH CHỮ NHẬT ===");
        
        System.out.print("Nhập chiều rộng: ");
        int width = scanner.nextInt();
        
        System.out.print("Nhập chiều cao: ");
        int height = scanner.nextInt();
        
        System.out.print("Nhập ký tự để vẽ: ");
        char symbol = scanner.next().charAt(0);
        
        System.out.println("\n=== HÌNH CHỮ NHẬT ===");
        
        // Vẽ hình chữ nhật đặc
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n=== HÌNH CHỮ NHẬT RỖNG ===");
        
        // Vẽ hình chữ nhật rỗng
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

### **Bài 4: Vẽ tam giác bằng ký tự**
```java
import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VẼ TAM GIÁC ===");
        
        System.out.print("Nhập chiều cao tam giác: ");
        int height = scanner.nextInt();
        
        System.out.print("Nhập ký tự để vẽ: ");
        char symbol = scanner.next().charAt(0);
        
        System.out.println("\n=== TAM GIÁC VUÔNG ===");
        
        // Vẽ tam giác vuông
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n=== TAM GIÁC CÂN ===");
        
        // Vẽ tam giác cân
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            // In ký tự
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

### **Bài 5: Tìm số hoàn hảo**
```java
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÌM SỐ HOÀN HẢO ===");
        
        System.out.print("Nhập giới hạn n: ");
        int n = scanner.nextInt();
        
        System.out.println("Các số hoàn hảo từ 1 đến " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
                // In các ước số
                System.out.print("(Ước số: ");
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(j);
                        if (j < i / 2) {
                            System.out.print(", ");
                        }
                    }
                }
                System.out.println(")");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
}
```

## 🎮 Challenge

### **Challenge 1: Vẽ hình phức tạp**
Tạo chương trình vẽ các hình phức tạp:
- Hình thoi
- Hình trái tim
- Hình ngôi sao
- Hình chữ X

### **Challenge 2: Tính giai thừa và tổ hợp**
```java
public class FactorialCalculator {
    public static void main(String[] args) {
        // Tính giai thừa: n! = n * (n-1) * (n-2) * ... * 1
        // Tính tổ hợp: C(n,k) = n! / (k! * (n-k)!)
    }
}
```

### **Challenge 3: Tìm số nguyên tố**
```java
public class PrimeNumberFinder {
    public static void main(String[] args) {
        // Tìm tất cả số nguyên tố từ 1 đến n
        // Sử dụng thuật toán Sieve of Eratosthenes
    }
}
```

### **Challenge 4: Vẽ tam giác Pascal**
```java
public class PascalTriangle {
    public static void main(String[] args) {
        // Vẽ tam giác Pascal với n hàng
        // Mỗi số = tổng của 2 số ở hàng trên
    }
}
```

## 📝 Kiến Thức Nâng Cao

### **1. Enhanced for loop (for-each)**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}

String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println(name);
}
```

### **2. Vòng lặp vô hạn và điều kiện thoát**
```java
// Vòng lặp vô hạn với break
for (;;) {
    // Code thực hiện
    if (điều_kiện_thoát) {
        break;
    }
}

// Hoặc
while (true) {
    // Code thực hiện
    if (điều_kiện_thoát) {
        break;
    }
}
```

### **3. Labeled break và continue**
```java
outer: for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            break outer; // Thoát khỏi cả 2 vòng lặp
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

## 🔧 Best Practices

### **1. Sử dụng biến có tên có ý nghĩa**
```java
// Tốt
for (int row = 1; row <= height; row++) {
    for (int col = 1; col <= width; col++) {
        // Code
    }
}

// Không tốt
for (int i = 1; i <= h; i++) {
    for (int j = 1; j <= w; j++) {
        // Code
    }
}
```

### **2. Tránh vòng lặp vô hạn**
```java
// Luôn có điều kiện thoát rõ ràng
for (int i = 1; i <= n; i++) {
    // Code
}
```

### **3. Sử dụng break và continue hợp lý**
```java
// Sử dụng break để thoát sớm
for (int i = 1; i <= 100; i++) {
    if (i > 50) {
        break; // Thoát khi i > 50
    }
    // Code
}

// Sử dụng continue để bỏ qua
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Bỏ qua số chẵn
    }
    System.out.println(i);
}
```

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu cấu trúc vòng lặp for cơ bản
- [ ] In được bảng cửu chương từ 1-10
- [ ] Tính tổng từ 1 đến n bằng vòng lặp
- [ ] Vẽ được hình chữ nhật bằng ký tự
- [ ] Vẽ được tam giác bằng ký tự
- [ ] Tìm được số hoàn hảo
- [ ] Hiểu nested loops
- [ ] Sử dụng break và continue
- [ ] Hoàn thành challenges
- [ ] Áp dụng best practices

## 📚 Tài Liệu Tham Khảo

- [Java For Loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)
- [Java Break and Continue](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html)
- [Java Nested Loops](https://www.tutorialspoint.com/java/java_loop_control.htm)

---

**Chúc bạn thành công với vòng lặp! 🚀**
