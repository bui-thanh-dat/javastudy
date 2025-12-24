import java.util.ArrayList;
import java.util.Scanner;

public class CONGTY {
    ArrayList<Person> ds = new ArrayList();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng nhân sự ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Chon loại ( 1- Worker, 2 - Manager) :");
            int chon = sc.nextInt();
            sc.nextLine(); // ăn Enter

            Person p;
            if (chon == 1) {
                p = new Worker();
            } else {
                p = new Manager();
            }

            p.nhap(); // đa hình
            ds.add(p);
        }
    }

    public void in() {
        for (Person p : ds) {
            p.in();
            System.out.printf("Luong: %.0f%n ", p.tinhLuong());
            System.out.println("-------------------------");

        }
    }
    public double tongLuong() {
        double sum = 0;
        for (Person p : ds) {
            sum += p.tinhLuong();
        }
        return sum;
    }
    public void maxLuong() {
        if (ds.isEmpty()) return;

        Person max = ds.get(0);
        for (Person p : ds) {
            if (p.tinhLuong() > max.tinhLuong()) {
                max = p;
            }
        }
        System.out.println("Nguoi co Luong cao nhat: ");
        max.in();
        System.out.printf("Luong: %.0f%n ", max.tinhLuong());
    }

}
