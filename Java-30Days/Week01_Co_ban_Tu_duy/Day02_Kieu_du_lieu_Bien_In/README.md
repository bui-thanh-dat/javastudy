# 📊 Day 02: Kiểu Dữ Liệu, Biến và In

## 🎯 Mục Tiêu Hôm Nay

- Hiểu các kiểu dữ liệu nguyên thủy trong Java
- Khai báo và sử dụng biến đúng cách
- Thực hành với các phép toán cơ bản
- Làm quen với Scanner để nhập dữ liệu
- Chuyển đổi giữa các kiểu dữ liệu

## 📚 Kiến Thức Cần Nắm

### **1. Kiểu dữ liệu nguyên thủy (Primitive Data Types)**

| Kiểu dữ liệu | Kích thước | Phạm vi | Giá trị mặc định |
|-------------|------------|---------|------------------|
| `byte` | 8 bit | -128 đến 127 | 0 |
| `short` | 16 bit | -32,768 đến 32,767 | 0 |
| `int` | 32 bit | -2³¹ đến 2³¹-1 | 0 |
| `long` | 64 bit | -2⁶³ đến 2⁶³-1 | 0L |
| `float` | 32 bit | ±3.4E-38 đến ±3.4E+38 | 0.0f |
| `double` | 64 bit | ±1.7E-308 đến ±1.7E+308 | 0.0 |
| `char` | 16 bit | 0 đến 65,535 | '\u0000' |
| `boolean` | 1 bit | true/false | false |

### **2. Khai báo biến**
```java
// Cú pháp: kiểu_dữ_liệu tên_biến = giá_trị;
int age = 25;
String name = "Nguyễn Văn A";
double height = 1.75;
boolean isStudent = true;
```

### **3. Scanner để nhập dữ liệu**
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
int number = scanner.nextInt();
double decimal = scanner.nextDouble();
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Khai báo và sử dụng biến**
```java
public class VariableDemo {
    public static void main(String[] args) {
        // Khai báo các kiểu dữ liệu khác nhau
        String name = "Nguyễn Văn A";
        int age = 20;
        double height = 1.75;
        float weight = 65.5f;
        char gender = 'M';
        boolean isStudent = true;
        
        // In thông tin
        System.out.println("=== THÔNG TIN CÁ NHÂN ===");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Giới tính: " + gender);
        System.out.println("Là sinh viên: " + isStudent);
        System.out.println("=========================");
    }
}
```

### **Bài 2: Nhập dữ liệu từ bàn phím**
```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN ===");
        
        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        
        // Nhập tuổi
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        
        // Nhập chiều cao
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        
        // Nhập cân nặng
        System.out.print("Nhập cân nặng (kg): ");
        float weight = scanner.nextFloat();
        
        // Nhập giới tính
        System.out.print("Nhập giới tính (M/F): ");
        char gender = scanner.next().charAt(0);
        
        // In thông tin đã nhập
        System.out.println("\n=== THÔNG TIN ĐÃ NHẬP ===");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Giới tính: " + gender);
        
        scanner.close();
    }
}
```

### **Bài 3: Tính toán với các kiểu dữ liệu**
```java
public class CalculationDemo {
    public static void main(String[] args) {
        // Khai báo biến
        int a = 10;
        int b = 3;
        double x = 15.5;
        double y = 4.2;
        
        // Phép toán với int
        System.out.println("=== PHÉP TOÁN VỚI INT ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));  // Kết quả là int
        System.out.println("a % b = " + (a % b));  // Chia lấy dư
        
        // Phép toán với double
        System.out.println("\n=== PHÉP TOÁN VỚI DOUBLE ===");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));  // Kết quả là double
        
        // Chuyển đổi kiểu dữ liệu
        System.out.println("\n=== CHUYỂN ĐỔI KIỂU DỮ LIỆU ===");
        double result1 = (double) a / b;  // Ép kiểu int sang double
        int result2 = (int) (x + y);      // Ép kiểu double sang int
        System.out.println("a / b (double) = " + result1);
        System.out.println("x + y (int) = " + result2);
    }
}
```

### **Bài 4: Chuyển đổi đơn vị đo lường**
```java
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CHUYỂN ĐỔI ĐƠN VỊ ĐO LƯỜNG ===");
        System.out.println("1. Chuyển đổi nhiệt độ (Celsius ↔ Fahrenheit)");
        System.out.println("2. Chuyển đổi độ dài (m ↔ feet)");
        System.out.println("3. Chuyển đổi khối lượng (kg ↔ pound)");
        
        System.out.print("Chọn loại chuyển đổi (1-3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                convertTemperature(scanner);
                break;
            case 2:
                convertLength(scanner);
                break;
            case 3:
                convertWeight(scanner);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        
        scanner.close();
    }
    
    public static void convertTemperature(Scanner scanner) {
        System.out.print("Nhập nhiệt độ Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
    
    public static void convertLength(Scanner scanner) {
        System.out.print("Nhập độ dài (mét): ");
        double meters = scanner.nextDouble();
        
        double feet = meters * 3.28084;
        
        System.out.println(meters + " m = " + feet + " feet");
    }
    
    public static void convertWeight(Scanner scanner) {
        System.out.print("Nhập khối lượng (kg): ");
        double kg = scanner.nextDouble();
        
        double pounds = kg * 2.20462;
        
        System.out.println(kg + " kg = " + pounds + " pounds");
    }
}
```

## 🎮 Challenge

### **Challenge 1: Máy tính đơn giản**
Tạo chương trình máy tính có thể:
- Nhập 2 số từ bàn phím
- Thực hiện 4 phép toán cơ bản
- Hiển thị kết quả với định dạng đẹp

### **Challenge 2: Tính chỉ số BMI**
Tạo chương trình tính chỉ số BMI:
```java
public class BMICalculator {
    public static void main(String[] args) {
        // Nhập chiều cao (m) và cân nặng (kg)
        // Tính BMI = weight / (height * height)
        // Phân loại BMI:
        // - Dưới 18.5: Thiếu cân
        // - 18.5-24.9: Bình thường
        // - 25-29.9: Thừa cân
        // - Trên 30: Béo phì
    }
}
```

### **Challenge 3: Chuyển đổi tiền tệ**
Tạo chương trình chuyển đổi tiền tệ:
- VND ↔ USD
- VND ↔ EUR
- VND ↔ JPY
- Sử dụng tỷ giá cố định hoặc nhập từ bàn phím

## 📝 Kiến Thức Nâng Cao

### **1. Type Casting (Ép kiểu)**
```java
// Implicit casting (tự động)
int i = 100;
long l = i;  // int → long

// Explicit casting (thủ công)
double d = 100.04;
int i = (int) d;  // double → int (mất phần thập phân)
```

### **2. Wrapper Classes**
```java
// Boxing: primitive → object
Integer intObj = Integer.valueOf(100);
Double doubleObj = Double.valueOf(3.14);

// Unboxing: object → primitive
int i = intObj.intValue();
double d = doubleObj.doubleValue();

// Auto-boxing (Java 5+)
Integer autoBox = 100;  // Tự động boxing
int autoUnbox = autoBox;  // Tự động unboxing
```

### **3. String Operations**
```java
String name = "Nguyễn Văn A";
int length = name.length();  // Độ dài chuỗi
String upper = name.toUpperCase();  // Chữ hoa
String lower = name.toLowerCase();  // Chữ thường
char firstChar = name.charAt(0);  // Ký tự đầu tiên
```

## 🔧 Best Practices

### **1. Đặt tên biến**
```java
// Tốt
String studentName;
int studentAge;
double studentHeight;

// Không tốt
String s;
int a;
double h;
```

### **2. Khai báo biến**
```java
// Khai báo gần nơi sử dụng
int age = 20;
System.out.println("Tuổi: " + age);

// Không khai báo ở đầu method nếu chưa dùng
```

### **3. Sử dụng Scanner**
```java
// Luôn đóng Scanner sau khi sử dụng
Scanner scanner = new Scanner(System.in);
// ... sử dụng scanner
scanner.close();
```

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu các kiểu dữ liệu nguyên thủy
- [ ] Khai báo và sử dụng biến đúng cách
- [ ] Sử dụng Scanner để nhập dữ liệu
- [ ] Thực hiện các phép toán cơ bản
- [ ] Chuyển đổi giữa các kiểu dữ liệu
- [ ] Hoàn thành bài tập chuyển đổi đơn vị
- [ ] Thử sức với challenges
- [ ] Hiểu type casting và wrapper classes

## 🔥 Bật chế độ Chiến!

- Hiểu dữ liệu để làm chủ chương trình.
- Biến đặt tên rõ ràng, ý tưởng sẽ rõ ràng.
- Thử – Sai – Sửa – Giỏi.

## 📚 Tài Liệu Tham Khảo

- [Java Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Java Scanner Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html)
- [Java Type Conversion](https://www.w3schools.com/java/java_type_casting.asp)

---

**Chúc bạn thành công với kiểu dữ liệu và biến! 🚀**
