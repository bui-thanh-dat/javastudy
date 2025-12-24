import java.util.Scanner;

public class Manager extends Person {
    double phuCap;

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền phụ cấp: ");
        phuCap = sc.nextDouble();
    }
    @Override
    public void in() {
        super.in();
        System.out.println(" Số tiền phụ cấp là : " + phuCap);
    }
    @Override
    public double tinhLuong(){
        return phuCap + 20000000;
    }
}
