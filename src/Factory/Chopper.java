package Factory;

public class Chopper implements Logistics{
    @Override
    public String selectVehicle() {
        return "Vehicle chopper has been selected";
    }
}
