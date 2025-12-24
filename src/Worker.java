import java.util.Scanner;

public class Worker extends Person {
    int bac;
    int soNgayCong;

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("NHập số ngày công: ");
        soNgayCong = sc.nextInt();
        System.out.println("Nhập số bậc : ");
         bac = sc.nextInt();
    }
    @Override
    public void in(){
        super.in();
        System.out.println("Số ngày công là: "+ soNgayCong);
        System.out.println("số bậc là: "+ bac);

    }
    @Override
    public double tinhLuong(){
        return soNgayCong * 250000 + bac * 500000;
    }
}
