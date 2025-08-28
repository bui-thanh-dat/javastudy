# 📋 Day 07: Ôn Tập và Menu Console

## 🎯 Mục Tiêu Hôm Nay

- Tổng hợp kiến thức tuần 1
- Xây dựng ứng dụng menu console hoàn chỉnh
- Thực hành tất cả kỹ năng đã học
- Tạo mini game tổng hợp
- Chuẩn bị cho tuần 2

## 📚 Tổng Kết Kiến Thức Tuần 1

### **1. Cú pháp cơ bản**
- Khai báo class và method
- Kiểu dữ liệu nguyên thủy
- Biến và hằng số
- Comments và documentation

### **2. Toán tử và biểu thức**
- Toán tử số học: `+`, `-`, `*`, `/`, `%`
- Toán tử gán: `=`, `+=`, `-=`, `*=`, `/=`
- Toán tử so sánh: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Toán tử logic: `&&`, `||`, `!`

### **3. Cấu trúc điều kiện**
- `if`, `if-else`, `if-else if-else`
- `switch-case`
- Toán tử điều kiện (ternary)

### **4. Vòng lặp**
- `for` loop
- `while` loop
- `do-while` loop
- `break` và `continue`

### **5. Input/Output**
- `Scanner` class
- `System.out.println()`, `System.out.print()`
- `printf()` để format

### **6. Math và Random**
- `Math.PI`, `Math.E`
- `Math.sqrt()`, `Math.pow()`, `Math.abs()`
- `Math.random()`

## 💻 Bài Tập Thực Hành

### **Bài 1: Ứng dụng quản lý sinh viên**
```java
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            displayMenu();
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    calculateGPA(scanner);
                    break;
                case 3:
                    gradeClassification(scanner);
                    break;
                case 4:
                    simpleCalculator(scanner);
                    break;
                case 5:
                    numberGuessingGame(scanner);
                    break;
                case 6:
                    patternGenerator(scanner);
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
    
    public static void displayMenu() {
        System.out.println("\n=== HỆ THỐNG QUẢN LÝ SINH VIÊN ===");
        System.out.println("1. Thêm sinh viên mới");
        System.out.println("2. Tính điểm trung bình");
        System.out.println("3. Xếp loại học lực");
        System.out.println("4. Máy tính đơn giản");
        System.out.println("5. Game đoán số");
        System.out.println("6. Tạo hình mẫu");
        System.out.println("0. Thoát");
        System.out.println("=================================");
    }
    
    public static void addStudent(Scanner scanner) {
        System.out.println("\n=== THÊM SINH VIÊN MỚI ===");
        
        System.out.print("Nhập tên sinh viên: ");
        scanner.nextLine(); // Xóa buffer
        String name = scanner.nextLine();
        
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        
        System.out.print("Nhập điểm Toán: ");
        double math = scanner.nextDouble();
        
        System.out.print("Nhập điểm Văn: ");
        double literature = scanner.nextDouble();
        
        System.out.print("Nhập điểm Anh: ");
        double english = scanner.nextDouble();
        
        // Tính điểm trung bình
        double gpa = (math + literature + english) / 3;
        
        // Hiển thị thông tin
        System.out.println("\n=== THÔNG TIN SINH VIÊN ===");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.printf("Điểm Toán: %.1f\n", math);
        System.out.printf("Điểm Văn: %.1f\n", literature);
        System.out.printf("Điểm Anh: %.1f\n", english);
        System.out.printf("Điểm TB: %.2f\n", gpa);
        
        // Xếp loại
        String grade = getGrade(gpa);
        System.out.println("Xếp loại: " + grade);
    }
    
    public static void calculateGPA(Scanner scanner) {
        System.out.println("\n=== TÍNH ĐIỂM TRUNG BÌNH ===");
        
        System.out.print("Nhập số môn học: ");
        int subjects = scanner.nextInt();
        
        if (subjects <= 0) {
            System.out.println("❌ Số môn học phải lớn hơn 0!");
            return;
        }
        
        double total = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.printf("Nhập điểm môn %d: ", i);
            double score = scanner.nextDouble();
            
            if (score < 0 || score > 10) {
                System.out.println("❌ Điểm phải từ 0-10!");
                i--; // Nhập lại
                continue;
            }
            
            total += score;
        }
        
        double gpa = total / subjects;
        System.out.printf("\nĐiểm trung bình: %.2f\n", gpa);
        System.out.println("Xếp loại: " + getGrade(gpa));
    }
    
    public static void gradeClassification(Scanner scanner) {
        System.out.println("\n=== XẾP LOẠI HỌC LỰC ===");
        
        System.out.print("Nhập điểm trung bình: ");
        double gpa = scanner.nextDouble();
        
        if (gpa < 0 || gpa > 10) {
            System.out.println("❌ Điểm phải từ 0-10!");
            return;
        }
        
        String grade = getGrade(gpa);
        System.out.println("Xếp loại: " + grade);
        
        // Thông tin chi tiết
        System.out.println("\n=== THÔNG TIN CHI TIẾT ===");
        if (gpa >= 9.0) {
            System.out.println("🎉 Xuất sắc - Học bổng toàn phần!");
        } else if (gpa >= 8.0) {
            System.out.println("🌟 Giỏi - Học bổng 50%!");
        } else if (gpa >= 7.0) {
            System.out.println("⭐ Khá - Tiếp tục phấn đấu!");
        } else if (gpa >= 5.0) {
            System.out.println("📚 Trung bình - Cần cố gắng hơn!");
        } else if (gpa >= 4.0) {
            System.out.println("⚠️ Yếu - Cần học lại!");
        } else {
            System.out.println("❌ Kém - Cần học lại toàn bộ!");
        }
    }
    
    public static void simpleCalculator(Scanner scanner) {
        System.out.println("\n=== MÁY TÍNH ĐƠN GIẢN ===");
        
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nChọn phép toán:");
        System.out.println("1. Cộng (+)");
        System.out.println("2. Trừ (-)");
        System.out.println("3. Nhân (*)");
        System.out.println("4. Chia (/)");
        System.out.println("5. Chia lấy dư (%)");
        System.out.println("6. Lũy thừa (^)");
        
        System.out.print("Nhập lựa chọn: ");
        int choice = scanner.nextInt();
        
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
                return;
        }
        
        System.out.printf("\nKết quả: %.2f %s %.2f = %.2f\n", 
                         num1, operation, num2, result);
    }
    
    public static void numberGuessingGame(Scanner scanner) {
        System.out.println("\n=== GAME ĐOÁN SỐ ===");
        
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int maxAttempts = 7;
        
        System.out.println("Tôi đã chọn một số từ 1-100.");
        System.out.println("Bạn có " + maxAttempts + " lần để đoán!");
        
        while (attempts < maxAttempts) {
            attempts++;
            System.out.printf("\nLần %d: Nhập số bạn đoán: ", attempts);
            
            int guess = scanner.nextInt();
            
            if (guess < 1 || guess > 100) {
                System.out.println("❌ Số phải từ 1-100!");
                attempts--;
                continue;
            }
            
            if (guess == secretNumber) {
                System.out.println("🎉 Chúc mừng! Bạn đã đoán đúng!");
                System.out.println("Số lần đoán: " + attempts);
                break;
            } else if (guess < secretNumber) {
                System.out.println("📈 Số cần tìm lớn hơn " + guess);
            } else {
                System.out.println("📉 Số cần tìm nhỏ hơn " + guess);
            }
            
            if (attempts < maxAttempts) {
                System.out.println("Còn " + (maxAttempts - attempts) + " lần.");
            }
        }
        
        if (attempts >= maxAttempts) {
            System.out.println("😔 Hết lượt! Số cần tìm là: " + secretNumber);
        }
    }
    
    public static void patternGenerator(Scanner scanner) {
        System.out.println("\n=== TẠO HÌNH MẪU ===");
        
        System.out.println("Chọn loại hình:");
        System.out.println("1. Tam giác vuông");
        System.out.println("2. Tam giác cân");
        System.out.println("3. Hình chữ nhật");
        System.out.println("4. Hình thoi");
        
        System.out.print("Nhập lựa chọn: ");
        int choice = scanner.nextInt();
        
        System.out.print("Nhập kích thước: ");
        int size = scanner.nextInt();
        
        System.out.print("Nhập ký tự để vẽ: ");
        char symbol = scanner.next().charAt(0);
        
        System.out.println("\n=== KẾT QUẢ ===");
        
        switch (choice) {
            case 1:
                drawRightTriangle(size, symbol);
                break;
            case 2:
                drawIsoscelesTriangle(size, symbol);
                break;
            case 3:
                drawRectangle(size, symbol);
                break;
            case 4:
                drawDiamond(size, symbol);
                break;
            default:
                System.out.println("❌ Lựa chọn không hợp lệ!");
        }
    }
    
    public static String getGrade(double gpa) {
        if (gpa >= 9.0) return "Xuất sắc";
        else if (gpa >= 8.0) return "Giỏi";
        else if (gpa >= 7.0) return "Khá";
        else if (gpa >= 5.0) return "Trung bình";
        else if (gpa >= 4.0) return "Yếu";
        else return "Kém";
    }
    
    public static void drawRightTriangle(int size, char symbol) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    public static void drawIsoscelesTriangle(int size, char symbol) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    public static void drawRectangle(int size, char symbol) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    public static void drawDiamond(int size, char symbol) {
        // Nửa trên
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        
        // Nửa dưới
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
```

### **Bài 2: Mini game tổng hợp**
```java
import java.util.Scanner;

public class MiniGameCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            displayGameMenu();
            System.out.print("Chọn game: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    rockPaperScissors(scanner);
                    break;
                case 2:
                    numberSequence(scanner);
                    break;
                case 3:
                    wordGuessing(scanner);
                    break;
                case 4:
                    mathQuiz(scanner);
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
    
    public static void displayGameMenu() {
        System.out.println("\n=== BỘ SƯU TẬP MINI GAME ===");
        System.out.println("1. Kéo Búa Bao");
        System.out.println("2. Đoán dãy số");
        System.out.println("3. Đoán từ");
        System.out.println("4. Quiz toán học");
        System.out.println("0. Thoát");
        System.out.println("============================");
    }
    
    public static void rockPaperScissors(Scanner scanner) {
        System.out.println("\n=== KÉO BÚA BAO ===");
        
        String[] choices = {"Kéo", "Búa", "Bao"};
        int playerScore = 0;
        int computerScore = 0;
        char playAgain;
        
        do {
            System.out.println("\nChọn: 1-Kéo, 2-Búa, 3-Bao");
            System.out.print("Lựa chọn của bạn: ");
            int playerChoice = scanner.nextInt();
            
            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("❌ Lựa chọn không hợp lệ!");
                continue;
            }
            
            int computerChoice = (int) (Math.random() * 3) + 1;
            
            System.out.println("Bạn chọn: " + choices[playerChoice - 1]);
            System.out.println("Máy chọn: " + choices[computerChoice - 1]);
            
            // Xác định người thắng
            if (playerChoice == computerChoice) {
                System.out.println("🤝 Hòa!");
            } else if ((playerChoice == 1 && computerChoice == 3) ||
                       (playerChoice == 2 && computerChoice == 1) ||
                       (playerChoice == 3 && computerChoice == 2)) {
                System.out.println("🎉 Bạn thắng!");
                playerScore++;
            } else {
                System.out.println("😔 Máy thắng!");
                computerScore++;
            }
            
            System.out.println("Tỷ số: Bạn " + playerScore + " - " + computerScore + " Máy");
            
            System.out.print("Chơi tiếp? (y/n): ");
            playAgain = scanner.next().toLowerCase().charAt(0);
            
        } while (playAgain == 'y');
        
        System.out.println("\n=== KẾT QUẢ CUỐI ===");
        if (playerScore > computerScore) {
            System.out.println("🏆 Bạn là người chiến thắng!");
        } else if (computerScore > playerScore) {
            System.out.println("💻 Máy là người chiến thắng!");
        } else {
            System.out.println("🤝 Hòa!");
        }
    }
    
    public static void numberSequence(Scanner scanner) {
        System.out.println("\n=== ĐOÁN DÃY SỐ ===");
        
        // Tạo dãy số ngẫu nhiên
        int[] sequence = new int[5];
        for (int i = 0; i < 5; i++) {
            sequence[i] = (int) (Math.random() * 10) + 1;
        }
        
        System.out.println("Dãy số: " + sequence[0] + " " + sequence[1] + " " + 
                          sequence[2] + " " + sequence[3] + " " + sequence[4]);
        
        System.out.println("Nhớ dãy số trên trong 5 giây...");
        
        // Đếm ngược
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Ignore
            }
        }
        System.out.println();
        
        // Xóa màn hình (giả lập)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        
        System.out.println("Nhập lại dãy số (cách nhau bởi dấu cách):");
        scanner.nextLine(); // Xóa buffer
        
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 5) {
            System.out.println("❌ Bạn phải nhập đúng 5 số!");
            return;
        }
        
        int correct = 0;
        for (int i = 0; i < 5; i++) {
            try {
                int num = Integer.parseInt(parts[i]);
                if (num == sequence[i]) {
                    correct++;
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Vui lòng nhập số hợp lệ!");
                return;
            }
        }
        
        System.out.println("Dãy số đúng: " + sequence[0] + " " + sequence[1] + " " + 
                          sequence[2] + " " + sequence[3] + " " + sequence[4]);
        System.out.println("Bạn đúng: " + correct + "/5 số");
        
        if (correct == 5) {
            System.out.println("🎉 Hoàn hảo!");
        } else if (correct >= 3) {
            System.out.println("👍 Tốt!");
        } else {
            System.out.println("😔 Cần cố gắng hơn!");
        }
    }
    
    public static void wordGuessing(Scanner scanner) {
        System.out.println("\n=== ĐOÁN TỪ ===");
        
        String[] words = {"JAVA", "PROGRAMMING", "COMPUTER", "ALGORITHM", "DATABASE"};
        String word = words[(int) (Math.random() * words.length)];
        
        System.out.println("Từ có " + word.length() + " chữ cái");
        System.out.println("Gợi ý: " + word.charAt(0) + "..." + word.charAt(word.length() - 1));
        
        int attempts = 0;
        int maxAttempts = 5;
        
        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("Lần " + attempts + ": Nhập từ bạn đoán: ");
            scanner.nextLine(); // Xóa buffer
            String guess = scanner.nextLine().toUpperCase();
            
            if (guess.equals(word)) {
                System.out.println("🎉 Chính xác! Từ đó là: " + word);
                System.out.println("Số lần đoán: " + attempts);
                return;
            } else {
                System.out.println("❌ Sai! Thử lại.");
                if (attempts < maxAttempts) {
                    System.out.println("Còn " + (maxAttempts - attempts) + " lần.");
                }
            }
        }
        
        System.out.println("😔 Hết lượt! Từ đó là: " + word);
    }
    
    public static void mathQuiz(Scanner scanner) {
        System.out.println("\n=== QUIZ TOÁN HỌC ===");
        
        int score = 0;
        int totalQuestions = 5;
        
        for (int i = 1; i <= totalQuestions; i++) {
            int num1 = (int) (Math.random() * 20) + 1;
            int num2 = (int) (Math.random() * 20) + 1;
            int operation = (int) (Math.random() * 4); // 0: +, 1: -, 2: *, 3: /
            
            int correctAnswer = 0;
            String operationSymbol = "";
            
            switch (operation) {
                case 0:
                    correctAnswer = num1 + num2;
                    operationSymbol = "+";
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    operationSymbol = "-";
                    break;
                case 2:
                    correctAnswer = num1 * num2;
                    operationSymbol = "*";
                    break;
                case 3:
                    if (num2 != 0 && num1 % num2 == 0) {
                        correctAnswer = num1 / num2;
                        operationSymbol = "/";
                    } else {
                        // Nếu phép chia không đẹp, chuyển sang cộng
                        correctAnswer = num1 + num2;
                        operationSymbol = "+";
                    }
                    break;
            }
            
            System.out.printf("Câu %d: %d %s %d = ? ", i, num1, operationSymbol, num2);
            int answer = scanner.nextInt();
            
            if (answer == correctAnswer) {
                System.out.println("✅ Đúng!");
                score++;
            } else {
                System.out.println("❌ Sai! Đáp án đúng là: " + correctAnswer);
            }
        }
        
        System.out.println("\n=== KẾT QUẢ ===");
        System.out.println("Điểm: " + score + "/" + totalQuestions);
        
        if (score == totalQuestions) {
            System.out.println("🏆 Xuất sắc!");
        } else if (score >= 4) {
            System.out.println("👍 Rất tốt!");
        } else if (score >= 3) {
            System.out.println("👌 Khá!");
        } else {
            System.out.println("📚 Cần ôn tập thêm!");
        }
    }
}
```

## 🎮 Challenge

### **Challenge 1: Tạo ứng dụng quản lý thư viện**
Xây dựng ứng dụng với các chức năng:
- Thêm sách mới
- Tìm kiếm sách
- Mượn/trả sách
- Thống kê sách
- Menu console hoàn chỉnh

### **Challenge 2: Game RPG đơn giản**
```java
public class SimpleRPG {
    public static void main(String[] args) {
        // Tạo game RPG với:
        // - Nhân vật có HP, MP, Level
        // - Combat system đơn giản
        // - Inventory system
        // - Quest system
        // - Save/Load game
    }
}
```

### **Challenge 3: Ứng dụng quản lý tài chính cá nhân**
```java
public class PersonalFinanceManager {
    public static void main(String[] args) {
        // Quản lý thu chi:
        // - Thêm thu nhập/chi tiêu
        // - Phân loại chi tiêu
        // - Thống kê theo tháng
        // - Đặt mục tiêu tiết kiệm
        // - Báo cáo tài chính
    }
}
```

## 📝 Kiến Thức Nâng Cao

### **1. Exception Handling**
```java
try {
    int number = scanner.nextInt();
    // Xử lý number
} catch (Exception e) {
    System.out.println("❌ Vui lòng nhập số hợp lệ!");
    scanner.nextLine(); // Xóa buffer
}
```

### **2. String Manipulation**
```java
String name = "Nguyen Van A";
String upper = name.toUpperCase();
String lower = name.toLowerCase();
String[] parts = name.split(" ");
int length = name.length();
char firstChar = name.charAt(0);
```

### **3. Array Operations**
```java
int[] numbers = {1, 2, 3, 4, 5};
int sum = 0;
for (int num : numbers) {
    sum += num;
}
```

## 🔧 Best Practices

### **1. Code Organization**
- Tách logic thành các method riêng biệt
- Sử dụng tên method có ý nghĩa
- Comment code quan trọng

### **2. User Experience**
- Hiển thị menu rõ ràng
- Validate input
- Thông báo lỗi thân thiện
- Hướng dẫn người dùng

### **3. Error Handling**
- Kiểm tra điều kiện hợp lệ
- Xử lý exception
- Cung cấp thông tin lỗi hữu ích

## 🎯 Checklist Hoàn Thành

- [ ] Tổng hợp kiến thức tuần 1
- [ ] Xây dựng ứng dụng menu console hoàn chỉnh
- [ ] Tạo hệ thống quản lý sinh viên
- [ ] Thực hiện các mini game
- [ ] Sử dụng tất cả kỹ năng đã học
- [ ] Xử lý input/output thành thạo
- [ ] Áp dụng cấu trúc điều kiện và vòng lặp
- [ ] Tạo giao diện người dùng thân thiện
- [ ] Hoàn thành challenges
- [ ] Chuẩn bị cho tuần 2

## 📚 Tài Liệu Tham Khảo

- [Java Tutorial](https://docs.oracle.com/javase/tutorial/)
- [Java Best Practices](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- [Java Exception Handling](https://docs.oracle.com/javase/tutorial/essential/exceptions/)

---

**Chúc mừng bạn đã hoàn thành Tuần 1! 🎉**
**Sẵn sàng cho Tuần 2 - Lập trình hướng đối tượng! 🚀**
