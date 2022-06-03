package Factory;

public class Ship implements Logistics{
    @Override
    public String selectVehicle(){
        return "Vehicle ship has been selected";
    }
}
