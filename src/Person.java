import java.util.Scanner;

public abstract class Person {
    String name;
    int ns;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten: ");
        name = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        ns = sc.nextInt();
        sc.nextLine();
    }
    public void in(){
        System.out.println("Ten: "+ name + " - Nam sinh : "+ ns);
    }
    public abstract double tinhLuong();
}
