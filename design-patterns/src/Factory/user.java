package Factory;

public class user {
    public static void main(String args[]){
        Logistics logistics = new LogisticFactory().getInstance("truck");
        System.out.println(logistics.selectVehicle());
    }
}
