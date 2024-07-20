package automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;

public class RepairShop  {
    private List<Vehicle> vehicles;
    private int capacity;

    public RepairShop(int capacity) {
        this.vehicles = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addVehicle (Vehicle vehicle){
        if (vehicles.size() < capacity){
            vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin){
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getVTN().equals(vin)){
                vehicles.remove(vehicle);
                return true;
            }
            break;
        }
        return false;
    }
    public int getCount (){
        return vehicles.size();
    }
    public Vehicle getLowestMileage (){
        Vehicle vehicle = null;
        int lowestMileage = Integer.MAX_VALUE;

        for (Vehicle currentVehicle: vehicles) {
            if (currentVehicle.getMileage() < lowestMileage){
                lowestMileage = currentVehicle.getMileage();
                vehicle = currentVehicle;
            }
        }
        return vehicle;
    }

    public String report (){
        StringBuilder builder = new StringBuilder();
        builder.append("Vehicles in the preparatory:").append(System.lineSeparator());

        for (Vehicle vehicle: vehicles) {
            builder.append(vehicle).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
