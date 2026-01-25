public abstract class Vehicle {
    protected String id; // bien so xe - duy nhat
    protected String brand; // hang san xuất
    protected int year; // nam san xuat
    protected String color; // mau sac
    protected double baseRentPrice; // Gia thue co ban/ ngay

    protected boolean isRented;
    public Vehicle(String id, String brand, int year, String color, double baseRentPrice) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.baseRentPrice = baseRentPrice;

        this.isRented = false;
    }
    public boolean isRented() { return isRented; }
    public void setRented(boolean isRented) { this.isRented = isRented; }

    // tim kiem/stream
    public String getId() { return id; }
    public String getBrand() { return brand; }

   public abstract double calculateDailyRent();

   public void displayInfo(){
       System.out.println("ID: " + id);
       System.out.println("Brand: " + brand);
       System.out.println("Year: " + year);
       System.out.println("Color: " + color);
       System.out.println("Base Rent Price: " + baseRentPrice);
   };
}
