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
            throw new IllegalAccessError("Year cannot be greater than current year");
        }
        vehicles.add(v);
        vehicleMap.put(v.getId(), v);
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
        if(v.isRented()){
            throw new IllegalArgumentException("Vehicle ID " + vehicleId + " is already rented");
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
