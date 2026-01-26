public class Truck extends Vehicle implements Maintainable {
    private double loadWeight; // Trong tai ( tan )

    public Truck(String id, String brand, int year, String color, double loadWeight){
        super(id, brand, year,color,loadWeight);
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateDailyRent(){
        return baseRentPrice + (loadWeight * 200000);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load weight: " + loadWeight);
    }

    @Override
    public void performMaintenance(){
        System.out.println("Truck" + id + " is under maintenance");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Load=%.2f tons", loadWeight);
    }

}
