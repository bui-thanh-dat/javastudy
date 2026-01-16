# 🔀 Day 04: Điều Kiện if-else, switch và Xếp Loại Điểm

## 🎯 Mục Tiêu Hôm Nay

- Hiểu và sử dụng cấu trúc điều kiện if-else
- Làm chủ switch-case statement
- Thực hành xếp loại điểm học tập
- Xử lý các trường hợp đặc biệt
- Xây dựng logic điều kiện phức tạp

## 📚 Kiến Thức Cần Nắm

### **1. Cấu trúc if-else**

#### **if đơn giản**
```java
if (điều_kiện) {
    // Code thực hiện nếu điều kiện đúng
}
```

#### **if-else**
```java
if (điều_kiện) {
    // Code thực hiện nếu điều kiện đúng
} else {
    // Code thực hiện nếu điều kiện sai
}
```

#### **if-else if-else**
```java
if (điều_kiện_1) {
    // Code thực hiện nếu điều kiện 1 đúng
} else if (điều_kiện_2) {
    // Code thực hiện nếu điều kiện 2 đúng
} else if (điều_kiện_3) {
    // Code thực hiện nếu điều kiện 3 đúng
} else {
    // Code thực hiện nếu tất cả điều kiện sai
}
```

### **2. Switch-case statement**
```java
switch (biến) {
    case giá_trị_1:
        // Code thực hiện
        break;
    case giá_trị_2:
        // Code thực hiện
        break;
    case giá_trị_3:
        // Code thực hiện
        break;
    default:
        // Code thực hiện nếu không có case nào khớp
        break;
}
```

### **3. Toán tử so sánh và logic**
```java
// Toán tử so sánh
==  // Bằng
!=  // Khác
>   // Lớn hơn
<   // Nhỏ hơn
>=  // Lớn hơn hoặc bằng
<=  // Nhỏ hơn hoặc bằng

// Toán tử logic
&&  // AND
||  // OR
!   // NOT
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Xếp loại điểm học tập**
```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== XẾP LOẠI ĐIỂM HỌC TẬP ===");
        
        // Nhập điểm
        System.out.print("Nhập điểm (0-10): ");
        double score = scanner.nextDouble();
        
        // Kiểm tra điểm hợp lệ
        if (score < 0 || score > 10) {
            System.out.println("❌ Điểm không hợp lệ! Điểm phải từ 0-10.");
        } else {
            // Xếp loại điểm
            String grade;
            if (score >= 9.0) {
                grade = "Xuất sắc";
            } else if (score >= 8.0) {
                grade = "Giỏi";
            } else if (score >= 7.0) {
                grade = "Khá";
            } else if (score >= 5.0) {
                grade = "Trung bình";
            } else if (score >= 4.0) {
                grade = "Yếu";
            } else {
                grade = "Kém";
            }
            
            System.out.println("=== KẾT QUẢ ===");
            System.out.printf("Điểm: %.1f\n", score);
            System.out.println("Xếp loại: " + grade);
        }
        
        scanner.close();
    }
}
```

### **Bài 2: Tính chỉ số BMI và phân loại**
```java
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH CHỈ SỐ BMI ===");
        
        // Nhập thông tin
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        
        // Kiểm tra dữ liệu hợp lệ
        if (height <= 0 || weight <= 0) {
            System.out.println("❌ Chiều cao và cân nặng phải lớn hơn 0!");
        } else {
            // Tính BMI
            double bmi = weight / (height * height);
            
            // Phân loại BMI
            String category;
            if (bmi < 18.5) {
                category = "Thiếu cân";
            } else if (bmi < 25) {
                category = "Bình thường";
            } else if (bmi < 30) {
                category = "Thừa cân";
            } else {
                category = "Béo phì";
            }
            
            // Hiển thị kết quả
            System.out.println("\n=== KẾT QUẢ ===");
            System.out.printf("Chiều cao: %.2f m\n", height);
            System.out.printf("Cân nặng: %.1f kg\n", weight);
            System.out.printf("Chỉ số BMI: %.1f\n", bmi);
            System.out.println("Phân loại: " + category);
        }
        
        scanner.close();
    }
}
```

### **Bài 3: Chương trình máy tính với switch**
```java
import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MÁY TÍNH VỚI SWITCH ===");
        
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
        
        System.out.print("Nhập lựa chọn (1-4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        String operation = "";
        boolean validOperation = true;
        
        // Thực hiện phép toán với switch
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
                    validOperation = false;
                }
                break;
            default:
                System.out.println("❌ Lựa chọn không hợp lệ!");
                validOperation = false;
        }
        
        // Hiển thị kết quả
        if (validOperation) {
            System.out.printf("\n=== KẾT QUẢ ===\n");
            System.out.printf("%.2f %s %.2f = %.2f\n", num1, operation, num2, result);
        }
        
        scanner.close();
    }
}
```

### **Bài 4: Xác định ngày trong tuần**
```java
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== XÁC ĐỊNH NGÀY TRONG TUẦN ===");
        
        System.out.print("Nhập số ngày (1-7): ");
        int day = scanner.nextInt();
        
        String dayName;
        
        switch (day) {
            case 1:
                dayName = "Thứ Hai";
                break;
            case 2:
                dayName = "Thứ Ba";
                break;
            case 3:
                dayName = "Thứ Tư";
                break;
            case 4:
                dayName = "Thứ Năm";
                break;
            case 5:
                dayName = "Thứ Sáu";
                break;
            case 6:
                dayName = "Thứ Bảy";
                break;
            case 7:
                dayName = "Chủ Nhật";
                break;
            default:
                dayName = "Không hợp lệ";
        }
        
        if (day >= 1 && day <= 7) {
            System.out.println("Ngày " + day + " là " + dayName);
        } else {
            System.out.println("❌ Số ngày không hợp lệ! Vui lòng nhập từ 1-7.");
        }
        
        scanner.close();
    }
}
```

## 🎮 Challenge

### **Challenge 1: Game đơn giản với điều kiện**
Tạo game đoán số với các tính năng:
- Random số từ 1-100
- Cho phép người chơi đoán tối đa 10 lần
- Gợi ý số lớn hơn hay nhỏ hơn
- Tính điểm dựa trên số lần đoán

### **Challenge 2: Hệ thống đăng nhập đơn giản**
```java
public class LoginSystem {
    public static void main(String[] args) {
        // Tạo tài khoản mẫu
        String correctUsername = "admin";
        String correctPassword = "123456";
        
        // Nhập thông tin đăng nhập
        // Kiểm tra username và password
        // Hiển thị thông báo phù hợp
    }
}
```

### **Challenge 3: Tính thuế thu nhập**
Tạo chương trình tính thuế thu nhập:
- Nhập thu nhập hàng tháng
- Tính thuế theo bậc thuế
- Hiển thị thuế phải nộp

## 📝 Kiến Thức Nâng Cao

### **1. Nested if (if lồng nhau)**
```java
if (điều_kiện_1) {
    if (điều_kiện_2) {
        // Code thực hiện
    } else {
        // Code thực hiện
    }
} else {
    // Code thực hiện
}
```

### **2. Switch với String (Java 7+)**
```java
String day = "Monday";
switch (day) {
    case "Monday":
        System.out.println("Thứ Hai");
        break;
    case "Tuesday":
        System.out.println("Thứ Ba");
        break;
    default:
        System.out.println("Ngày khác");
}
```

### **3. Switch expression (Java 14+)**
```java
String result = switch (day) {
    case "Monday" -> "Thứ Hai";
    case "Tuesday" -> "Thứ Ba";
    default -> "Ngày khác";
};
```

### **4. Toán tử điều kiện (Ternary)**
```java
int age = 20;
String status = (age >= 18) ? "Người lớn" : "Trẻ em";

// Tương đương với:
String status;
if (age >= 18) {
    status = "Người lớn";
} else {
    status = "Trẻ em";
}
```

## 🔧 Best Practices

### **1. Sử dụng else if thay vì nhiều if**
```java
// Tốt
if (score >= 9.0) {
    grade = "Xuất sắc";
} else if (score >= 8.0) {
    grade = "Giỏi";
} else if (score >= 7.0) {
    grade = "Khá";
}

// Không tốt
if (score >= 9.0) {
    grade = "Xuất sắc";
}
if (score >= 8.0 && score < 9.0) {
    grade = "Giỏi";
}
if (score >= 7.0 && score < 8.0) {
    grade = "Khá";
}
```

### **2. Luôn có default trong switch**
```java
switch (choice) {
    case 1:
        // Code
        break;
    case 2:
        // Code
        break;
    default:
        // Xử lý trường hợp không khớp
        break;
}
```

### **3. Kiểm tra điều kiện hợp lệ trước**
```java
// Kiểm tra dữ liệu đầu vào trước khi xử lý
if (score < 0 || score > 10) {
    System.out.println("Điểm không hợp lệ!");
    return;
}
// Tiếp tục xử lý...
```

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu cấu trúc if-else cơ bản
- [ ] Sử dụng if-else if-else thành thạo
- [ ] Làm chủ switch-case statement
- [ ] Xếp loại điểm học tập chính xác
- [ ] Tính và phân loại BMI
- [ ] Xây dựng máy tính với switch
- [ ] Xác định ngày trong tuần
- [ ] Hiểu nested if và switch nâng cao
- [ ] Hoàn thành challenges
- [ ] Áp dụng best practices

## 🔥 Bật chế độ Chiến!

- Logic tốt, quyết định đúng.
- Chia bài toán lớn thành nhiều điều kiện nhỏ.
- Cứ viết, rồi refactor.

## 📚 Tài Liệu Tham Khảo

- [Java Control Flow](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Java Switch Statement](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
- [Java Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

---

**Chúc bạn thành công với điều kiện và logic! 🚀**
