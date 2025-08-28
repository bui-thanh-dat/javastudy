# 🔁 Day 06: Vòng Lặp While, Do-While và Đoán Số Ngẫu Nhiên

## 🎯 Mục Tiêu Hôm Nay

- Hiểu và sử dụng vòng lặp while
- Làm chủ vòng lặp do-while
- Tạo số ngẫu nhiên với Math.random()
- Xây dựng game đoán số
- Thực hành menu lặp

## 📚 Kiến Thức Cần Nắm

### **1. Vòng lặp while**
```java
while (điều_kiện) {
    // Code thực hiện
    // Cập nhật điều kiện để tránh vòng lặp vô hạn
}

// Ví dụ:
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++; // Quan trọng: cập nhật biến điều kiện
}
```

### **2. Vòng lặp do-while**
```java
do {
    // Code thực hiện (ít nhất 1 lần)
    // Cập nhật điều kiện
} while (điều_kiện);

// Ví dụ:
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 10);
```

### **3. Sự khác biệt giữa while và do-while**
- **while**: Kiểm tra điều kiện trước, có thể không thực hiện lần nào
- **do-while**: Thực hiện ít nhất 1 lần, sau đó mới kiểm tra điều kiện

### **4. Tạo số ngẫu nhiên**
```java
// Tạo số ngẫu nhiên từ 0.0 đến 1.0 (không bao gồm 1.0)
double random = Math.random();

// Tạo số nguyên ngẫu nhiên từ 1 đến 100
int randomNumber = (int) (Math.random() * 100) + 1;

// Tạo số nguyên ngẫu nhiên từ min đến max
int min = 1, max = 10;
int randomInRange = (int) (Math.random() * (max - min + 1)) + min;
```

## 💻 Bài Tập Thực Hành

### **Bài 1: Game đoán số ngẫu nhiên**
```java
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tạo số ngẫu nhiên từ 1-100
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("=== GAME ĐOÁN SỐ ===");
        System.out.println("Tôi đã chọn một số từ 1-100.");
        System.out.println("Bạn có " + maxAttempts + " lần để đoán!");
        
        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("\nLần " + attempts + ": Nhập số bạn đoán: ");
            
            int guess;
            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("❌ Vui lòng nhập số hợp lệ!");
                scanner.nextLine(); // Xóa buffer
                attempts--; // Không tính lần này
                continue;
            }
            
            if (guess < 1 || guess > 100) {
                System.out.println("❌ Số phải từ 1-100!");
                attempts--; // Không tính lần này
                continue;
            }
            
            if (guess == secretNumber) {
                System.out.println("🎉 Chúc mừng! Bạn đã đoán đúng số " + secretNumber + "!");
                System.out.println("Số lần đoán: " + attempts);
                
                // Tính điểm
                int score = maxAttempts - attempts + 1;
                System.out.println("Điểm: " + score + "/" + maxAttempts);
                break;
            } else if (guess < secretNumber) {
                System.out.println("📈 Số cần tìm lớn hơn " + guess);
            } else {
                System.out.println("📉 Số cần tìm nhỏ hơn " + guess);
            }
            
            // Hiển thị số lần còn lại
            int remaining = maxAttempts - attempts;
            if (remaining > 0) {
                System.out.println("Còn " + remaining + " lần đoán.");
            }
        }
        
        if (attempts >= maxAttempts) {
            System.out.println("😔 Hết lượt! Số cần tìm là: " + secretNumber);
        }
        
        scanner.close();
    }
}
```

### **Bài 2: Menu lặp với do-while**
```java
import java.util.Scanner;

public class MenuLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Hiển thị menu
            System.out.println("\n=== MENU CHÍNH ===");
            System.out.println("1. Tính tổng từ 1 đến n");
            System.out.println("2. Tính giai thừa");
            System.out.println("3. Kiểm tra số nguyên tố");
            System.out.println("4. In bảng cửu chương");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    calculateSum(scanner);
                    break;
                case 2:
                    calculateFactorial(scanner);
                    break;
                case 3:
                    checkPrime(scanner);
                    break;
                case 4:
                    printMultiplicationTable(scanner);
                    break;
                case 0:
                    System.out.println("👋 Tạm biệt!");
                    break;
                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
    
    public static void calculateSum(Scanner scanner) {
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("❌ Số n phải lớn hơn 0!");
            return;
        }
        
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("Tổng từ 1 đến " + n + " = " + sum);
    }
    
    public static void calculateFactorial(Scanner scanner) {
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("❌ Không thể tính giai thừa số âm!");
            return;
        }
        
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        
        System.out.println(n + "! = " + factorial);
    }
    
    public static void checkPrime(Scanner scanner) {
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println(n + " không phải số nguyên tố.");
            return;
        }
        
        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        
        if (isPrime) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải số nguyên tố.");
        }
    }
    
    public static void printMultiplicationTable(Scanner scanner) {
        System.out.print("Nhập số n (1-10): ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 10) {
            System.out.println("❌ Số n phải từ 1-10!");
            return;
        }
        
        System.out.println("Bảng cửu chương " + n + ":");
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
            i++;
        }
    }
}
```

### **Bài 3: Tính trung bình với do-while**
```java
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH TRUNG BÌNH DÃY SỐ ===");
        System.out.println("Nhập các số (nhập -1 để kết thúc):");
        
        int sum = 0;
        int count = 0;
        int number;
        
        do {
            System.out.print("Nhập số thứ " + (count + 1) + ": ");
            number = scanner.nextInt();
            
            if (number != -1) {
                sum += number;
                count++;
            }
            
        } while (number != -1);
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\n=== KẾT QUẢ ===");
            System.out.println("Số lượng số đã nhập: " + count);
            System.out.println("Tổng: " + sum);
            System.out.printf("Trung bình: %.2f\n", average);
        } else {
            System.out.println("❌ Không có số nào được nhập!");
        }
        
        scanner.close();
    }
}
```

### **Bài 4: Tìm ước số chung lớn nhất (UCLN)**
```java
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH UCLN ===");
        
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        
        if (a == 0 && b == 0) {
            System.out.println("❌ Không thể tính UCLN của 0 và 0!");
        } else {
            // Sử dụng thuật toán Euclidean
            int originalA = Math.abs(a);
            int originalB = Math.abs(b);
            
            while (originalB != 0) {
                int temp = originalB;
                originalB = originalA % originalB;
                originalA = temp;
            }
            
            System.out.println("UCLN của " + a + " và " + b + " là: " + originalA);
        }
        
        scanner.close();
    }
}
```

### **Bài 5: Game xúc xắc đơn giản**
```java
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GAME XÚC XẮC ===");
        System.out.println("Đoán số xúc xắc (1-6)");
        
        int totalGames = 0;
        int wins = 0;
        char playAgain;
        
        do {
            totalGames++;
            
            // Tạo số ngẫu nhiên từ 1-6
            int diceNumber = (int) (Math.random() * 6) + 1;
            
            System.out.print("\nLần " + totalGames + ": Nhập số bạn đoán (1-6): ");
            int guess = scanner.nextInt();
            
            if (guess < 1 || guess > 6) {
                System.out.println("❌ Số phải từ 1-6!");
                totalGames--; // Không tính lần này
            } else {
                System.out.println("Xúc xắc: " + diceNumber);
                
                if (guess == diceNumber) {
                    System.out.println("🎉 Đúng rồi!");
                    wins++;
                } else {
                    System.out.println("😔 Sai rồi!");
                }
                
                System.out.println("Tỷ lệ thắng: " + wins + "/" + totalGames);
            }
            
            System.out.print("Chơi tiếp? (y/n): ");
            playAgain = scanner.next().toLowerCase().charAt(0);
            
        } while (playAgain == 'y');
        
        System.out.println("\n=== KẾT QUẢ CUỐI CÙNG ===");
        System.out.println("Tổng số lần chơi: " + totalGames);
        System.out.println("Số lần thắng: " + wins);
        if (totalGames > 0) {
            double winRate = (double) wins / totalGames * 100;
            System.out.printf("Tỷ lệ thắng: %.1f%%\n", winRate);
        }
        
        scanner.close();
    }
}
```

## 🎮 Challenge

### **Challenge 1: Game đoán số nâng cao**
Tạo game đoán số với các tính năng:
- Chọn độ khó (dễ: 1-50, trung bình: 1-100, khó: 1-200)
- Tính điểm dựa trên độ khó và số lần đoán
- Lưu điểm cao nhất
- Thêm gợi ý "nóng/lạnh"

### **Challenge 2: Máy tính bỏ túi với menu lặp**
```java
public class AdvancedCalculator {
    public static void main(String[] args) {
        // Tạo máy tính với các chức năng:
        // - Các phép toán cơ bản
        // - Tính căn bậc hai
        // - Tính lũy thừa
        // - Lịch sử tính toán
        // - Menu lặp cho đến khi chọn thoát
    }
}
```

### **Challenge 3: Game rắn săn mồi đơn giản**
```java
public class SimpleSnakeGame {
    public static void main(String[] args) {
        // Tạo game rắn săn mồi console:
        // - Rắn di chuyển theo hướng
        // - Ăn mồi để tăng điểm
        // - Game over khi đâm vào tường hoặc chính mình
        // - Sử dụng vòng lặp while để game loop
    }
}
```

## 📝 Kiến Thức Nâng Cao

### **1. Vòng lặp vô hạn và điều kiện thoát**
```java
// Vòng lặp vô hạn với break
while (true) {
    // Code thực hiện
    if (điều_kiện_thoát) {
        break;
    }
}

// Vòng lặp với flag
boolean running = true;
while (running) {
    // Code thực hiện
    if (điều_kiện_thoát) {
        running = false;
    }
}
```

### **2. Random với seed**
```java
import java.util.Random;

Random random = new Random(123); // Seed cố định
int number = random.nextInt(100) + 1; // 1-100

// Hoặc seed theo thời gian
Random random2 = new Random(System.currentTimeMillis());
```

### **3. Input validation với while**
```java
Scanner scanner = new Scanner(System.in);
int number;

do {
    System.out.print("Nhập số từ 1-10: ");
    while (!scanner.hasNextInt()) {
        System.out.println("❌ Vui lòng nhập số!");
        scanner.next();
    }
    number = scanner.nextInt();
} while (number < 1 || number > 10);
```

## 🔧 Best Practices

### **1. Tránh vòng lặp vô hạn**
```java
// Luôn có điều kiện thoát rõ ràng
int i = 0;
while (i < 10) {
    // Code
    i++; // Quan trọng!
}
```

### **2. Sử dụng do-while khi cần thực hiện ít nhất 1 lần**
```java
// Menu, input validation
do {
    // Hiển thị menu
    // Nhập lựa chọn
} while (lựa_chọn_không_hợp_lệ);
```

### **3. Xử lý exception trong vòng lặp**
```java
while (true) {
    try {
        int number = scanner.nextInt();
        // Xử lý number
        break;
    } catch (Exception e) {
        System.out.println("❌ Vui lòng nhập số hợp lệ!");
        scanner.nextLine(); // Xóa buffer
    }
}
```

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu cấu trúc vòng lặp while
- [ ] Sử dụng vòng lặp do-while thành thạo
- [ ] Tạo số ngẫu nhiên với Math.random()
- [ ] Xây dựng game đoán số hoàn chỉnh
- [ ] Tạo menu lặp với do-while
- [ ] Tính trung bình dãy số
- [ ] Tìm UCLN bằng thuật toán Euclidean
- [ ] Tạo game xúc xắc
- [ ] Hiểu sự khác biệt while vs do-while
- [ ] Hoàn thành challenges
- [ ] Áp dụng best practices

## 🔥 Bật chế độ Chiến!

- Luôn có điểm dừng cho mọi vòng lặp – cả trong học tập.
- Thắng không phải do may mắn, mà do luyện tập.
- Cứ thử thêm một lần nữa.

## 📚 Tài Liệu Tham Khảo

- [Java While Loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
- [Java Do-While Loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
- [Java Math.random()](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#random())

---

**Chúc bạn thành công với vòng lặp while và do-while! 🚀**
