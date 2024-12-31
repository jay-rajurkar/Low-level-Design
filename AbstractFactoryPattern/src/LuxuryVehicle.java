public class LuxuryVehicle implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
//            case "Maruthi":
//                return new MaruthiSuzuki();
            case "BMW":
                return new Bmw();
            case "Mercedes":
                return new Mercedes();
            default:
                return null;
        }

    }
}
