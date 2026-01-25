public class Motorbike extends Vehicle{
    private int capacity; // Dung tich(cc);

    public Motorbike(String id, String brand, int year, String color, double baseRentPrice, int capacity ){
        super(id, brand, year, color, baseRentPrice);
        this.capacity = capacity;
    }
    @Override
    public double calculateDailyRent() {
        if(capacity < 150){
            return baseRentPrice;
        } else {
            return baseRentPrice * 1.5;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorbike's capacity is " + capacity + "cc");
    }
}
