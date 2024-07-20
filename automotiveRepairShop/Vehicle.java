package automotiveRepairShop;

public class Vehicle {
    private String VTN;
    private int mileage;
    private String damage;

    public Vehicle(String VTN, int mileage, String damage) {
        this.VTN = VTN;
        this.mileage = mileage;
        this.damage = damage;
    }

    public String getVTN() {
        return VTN;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDamage() {
        return damage;
    }

    public void setVTN(String VTN) {
        this.VTN = VTN;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    @Override
    public String toString (){
        return String.format("Damage: %s, Vehicle: %s (%d km)",this.damage,this.VTN,this.mileage);
    }
}
