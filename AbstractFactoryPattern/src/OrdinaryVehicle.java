public class OrdinaryVehicle implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {

        switch (input){
            case "Maruthi":
                return new MaruthiSuzuki();
            case "Hyundai":
                return new Hyundai();
            default:
                return null;
        }

    }
}
