public class LevelTwoFactory {

    public VehicleFactory getVehicleFactory(String input){

        switch(input){
            case "Luxury":
                return new LuxuryVehicle();
            case "Ordinary":
                return new OrdinaryVehicle();
            default:
                return null;
        }
    }
}
