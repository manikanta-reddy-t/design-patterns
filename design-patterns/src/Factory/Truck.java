package Factory;

public class Truck implements Logistics{
    @Override
    public String selectVehicle() {
        return "Vehicle Truck has been selected";
    }
}
