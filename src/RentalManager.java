import java.util.*;
import java.time.Year;

public class RentalManager {

    private final List<Vehicle> vehicles = new ArrayList<>();
    private final Map<String, Vehicle> vehicleMap = new HashMap<>();

    //1) them xe
    public void addVehicle(Vehicle v) throws DuplicateIDException {
        // kiem tra trung ID
        if(vehicleMap.containsKey(v.getId())){
            throw new DuplicateIDException("Duplicate Vehicle ID" + v.getId());
        }

        // xac thuc (validate) năm sản xuất
        int currentYear = Year.now().getValue();
        if(v.year > currentYear){ // neu year dang protected, neu private thi getter
            throw new IllegalArgumentException("Year cannot be greater than current year");
        }

        vehicles.add(v);
        vehicleMap.put(v.getId(), v);
    }

    //Overload: them xe tu ban phim
    public void addVehicle(Scanner sc) throws DuplicateIDException {

        System.out.println("Type ( 1 = Motorbike, 2 = Truck) : ");
        int type = Integer.parseInt(sc.nextLine());

        System.out.println("Vehicle ID: ");
        String id = sc.nextLine();

        System.out.println("Brand: ");
        String brand = sc.nextLine();

        System.out.println("Year: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.print("Color: ");
        String color = sc.nextLine();

        System.out.print("Price per day: ");
        double price = Double.parseDouble(sc.nextLine());


        Vehicle v;

        if(type == 1){
            System.out.println("Engine capacity (cc): ");
            int engineCapacity = Integer.parseInt(sc.nextLine());

            v = new Motorbike(id,brand, year, color, price, engineCapacity);
        } else  if(type == 2){
            System.out.println("Load capacity (tons): ");
            double load = Double.parseDouble(sc.nextLine());

            v = new Truck(id, brand, year, color, load);
        } else {
            throw new IllegalArgumentException("Invalid Vehicle Type");
        }

        //Goi ham Loi
        addVehicle(v);
    }
    // 2) Tìm theo ID (O(1))
    public  Vehicle findById(String id){
        return vehicleMap.get(id);
    }
    /*
    //3) Tim theo brand (stream filter)
    public List<Vehicle> searchByBrand(String brand){
        String key = brand.trim().toLowerCase();
        return
    }

     */
    // 4) Thue xe
    public void rentVehicle(String customerId, String vehicleId)
            throws VehicleUnavailableException {
        Vehicle v = vehicleMap.get(vehicleId);
        if(v == null){
            throw new IllegalArgumentException("Vehicle ID " + vehicleId + " not found");
        }
        if(v.isRented()){
            throw new VehicleUnavailableException("Vehicle ID " + vehicleId + " is already rented");
        }

        v.setRented(true); // Đánh dấu xe này là đã được thuê.

        System.out.println("Customer ID: " + customerId + " Vehicle ID: " + vehicleId);
    }

    // 5) Tra xe & tinh tien

    public double retunVehicleAndCalculateFee(String vehicleId, int days) {
        Vehicle v = vehicleMap.get(vehicleId);
        if(v == null){
            throw new IllegalArgumentException("Vehicle ID " + vehicleId + " not found");
        }
        if(!v.isRented()){
            throw new IllegalArgumentException("Vehicle ID " + vehicleId + " is not currently  rented");
        }
        if(days <= 0){
            throw new IllegalArgumentException("Days must be greater than 0");
        }

        double totalFee = v.calculateDailyRent() * days;
        v.setRented(false);
        return totalFee;
    }

    // 6) Sap xep theo gia thue giam dan ( comparator + lambda)
    public void sortByDailyRentDesc() {
        vehicles.sort((a,b) -> Double.compare(b.calculateDailyRent(), a.calculateDailyRent()));
    }
    //7) sap xep theo hang A - Z;
    public void sortByBrandAZ(){
        vehicles.sort(Comparator.comparing( v -> v.getBrand().toLowerCase()));
    }
    //tien tich: lay toan bo danh sach de show
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
