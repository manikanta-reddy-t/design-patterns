package Factory;

public class NotAvailbale implements Logistics
{
    @Override
    public String selectVehicle() {
        return "Selected vehicle is not available";
    }
}
