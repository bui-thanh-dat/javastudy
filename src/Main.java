import java.util.*;

public class Main {
    public static void main(String[] args) {
        RentalManager manager  = new RentalManager();
        Scanner sc = new Scanner(System.in);

        // Nếu có load file thì gọi ở đây:
        // manager .loadFromFile("vehicles.csv");

        while(true){
            System.out.println("\n ===== Vehicle Rental System =====");
            System.out.println("\n 1. Add Vehicle(Motorbike/Truck)");
            System.out.println("\n 2. Show all Vehicles");
            System.out.println("\n 4. Rent a vehicle");
            System.out.println("\n 5. Return a vehicle & Calculate fee");
            System.out.println("\n 6. Sort vehicles by Price ");
            System.out.println("\n 7. Save & Exit ");
            System.out.println("\n Choose an option: ");

            String option = sc.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(option);
            } catch (NumberFormatException e) {
                System.out.println("\n Please enter a valid option! ( 1 - 7 )");
                continue;
            }
            switch(choice) {
                case 1:
                    manager.addVehicle(sc);
                    break;
            }
        }

    }
}