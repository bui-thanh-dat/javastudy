# 📊 Day 15: Array, Tìm Max và Sắp Xếp

## 🎯 Mục Tiêu Hôm Nay

- Hiểu và sử dụng Array 1D và 2D
- Implement các thuật toán tìm kiếm cơ bản
- Thực hành các thuật toán sắp xếp
- Tối ưu hóa hiệu suất thuật toán

## 📚 Kiến Thức Cần Nắm

### **1. Array (Mảng)**
Array là cấu trúc dữ liệu lưu trữ nhiều giá trị cùng kiểu dữ liệu.

```java
// Khai báo array
int[] numbers = new int[5];
int[] scores = {85, 92, 78, 96, 88};

// Array 2D
int[][] matrix = new int[3][4];
int[][] grid = {{1,2,3}, {4,5,6}, {7,8,9}};
```

### **2. Thuật toán tìm kiếm**
- **Linear Search**: Duyệt tuần tự
- **Binary Search**: Tìm kiếm nhị phân (array đã sắp xếp)

### **3. Thuật toán sắp xếp**
- **Bubble Sort**: So sánh và đổi chỗ liền kề
- **Selection Sort**: Tìm min và đổi chỗ
- **Insertion Sort**: Chèn từng phần tử vào vị trí đúng

## 💻 Bài Tập Thực Hành

### **Bài 1: Tìm max, min trong array**
```java
public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 67, 34, 89, 56, 78};
        
        // Tìm max
        int max = findMax(numbers);
        System.out.println("Số lớn nhất: " + max);
        
        // Tìm min
        int min = findMin(numbers);
        System.out.println("Số nhỏ nhất: " + min);
        
        // Tìm max và min cùng lúc
        int[] result = findMaxMin(numbers);
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
    }
    
    public static int findMax(int[] arr) {
        if (arr.length == 0) return -1;
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        if (arr.length == 0) return -1;
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int[] findMaxMin(int[] arr) {
        if (arr.length == 0) return new int[]{-1, -1};
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        
        return new int[]{max, min};
    }
}
```

### **Bài 2: Bubble Sort**
```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array trước khi sắp xếp:");
        printArray(numbers);
        
        bubbleSort(numbers);
        
        System.out.println("Array sau khi sắp xếp:");
        printArray(numbers);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // Nếu không có đổi chỗ nào, array đã sắp xếp
            if (!swapped) break;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

### **Bài 3: Selection Sort**
```java
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Array trước khi sắp xếp:");
        printArray(numbers);
        
        selectionSort(numbers);
        
        System.out.println("Array sau khi sắp xếp:");
        printArray(numbers);
    }
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong phần chưa sắp xếp
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

### **Bài 4: Linear Search và Binary Search**
```java
public class SearchAlgorithms {
    public static void main(String[] args) {
        int[] numbers = {11, 12, 22, 25, 34, 64, 90};
        int target = 25;
        
        // Linear Search
        int linearResult = linearSearch(numbers, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Tìm thấy " + target + " tại vị trí " + linearResult);
        } else {
            System.out.println("Linear Search: Không tìm thấy " + target);
        }
        
        // Binary Search
        int binaryResult = binarySearch(numbers, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Tìm thấy " + target + " tại vị trí " + binaryResult);
        } else {
            System.out.println("Binary Search: Không tìm thấy " + target);
        }
    }
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
```

## 🎮 Challenge

### **Challenge 1: Sắp xếp array 2D**
Tạo chương trình sắp xếp ma trận 2D theo từng hàng:

```java
public class MatrixSort {
    public static void main(String[] args) {
        int[][] matrix = {
            {64, 34, 25},
            {12, 22, 11},
            {90, 45, 67}
        };
        
        System.out.println("Ma trận trước khi sắp xếp:");
        printMatrix(matrix);
        
        sortMatrix(matrix);
        
        System.out.println("Ma trận sau khi sắp xếp:");
        printMatrix(matrix);
    }
    
    public static void sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            bubbleSort(matrix[i]);
        }
    }
    
    // Implement bubbleSort và printMatrix
}
```

### **Challenge 2: Tìm phần tử xuất hiện nhiều nhất**
```java
public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5, 6, 3, 2};
        
        int mostFrequent = findMostFrequent(numbers);
        System.out.println("Phần tử xuất hiện nhiều nhất: " + mostFrequent);
    }
    
    public static int findMostFrequent(int[] arr) {
        // Implement thuật toán đếm tần suất
        return 0;
    }
}
```

## 📊 Phân Tích Độ Phức Tạp

### **Time Complexity:**
- **Linear Search**: O(n)
- **Binary Search**: O(log n)
- **Bubble Sort**: O(n²)
- **Selection Sort**: O(n²)
- **Insertion Sort**: O(n²)

### **Space Complexity:**
- Tất cả các thuật toán trên: O(1) (in-place)

## 🔧 Best Practices

### **1. Validation**
```java
public static int findMax(int[] arr) {
    if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array không được null hoặc rỗng");
    }
    // ... rest of the code
}
```

### **2. Generic Methods**
```java
public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
    // Generic bubble sort
}
```

### **3. Performance Optimization**
- Sử dụng binary search cho array đã sắp xếp
- Early termination trong bubble sort
- Minimize array copying

## 🎯 Checklist Hoàn Thành

- [ ] Hiểu cấu trúc Array 1D và 2D
- [ ] Implement thuật toán tìm max/min
- [ ] Implement Bubble Sort
- [ ] Implement Selection Sort
- [ ] Implement Linear Search
- [ ] Implement Binary Search
- [ ] Hiểu độ phức tạp thuật toán
- [ ] Hoàn thành challenges

## 🔥 Bật chế độ Chiến!

- Dữ liệu đúng cấu trúc – thuật toán sẽ hiệu quả.
- Hiểu độ phức tạp – tiết kiệm thời gian.
- Viết chậm để chạy nhanh.

## 📚 Tài Liệu Tham Khảo

- [Java Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Sorting Algorithms](https://www.geeksforgeeks.org/sorting-algorithms/)
- [Searching Algorithms](https://www.geeksforgeeks.org/searching-algorithms/)

---

**Chúc bạn thành công với thuật toán! 🚀**
