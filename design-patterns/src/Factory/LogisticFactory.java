package Factory;

public class LogisticFactory {
    public Logistics getInstance(String Vehicle){
        switch (Vehicle){
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            case "chopper":
                return new Chopper();
            default:
                return new NotAvailbale();
        }
    }
}
