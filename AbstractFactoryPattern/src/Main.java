public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

        LevelTwoFactory levelTwoFactory = new LevelTwoFactory();
        //getting object from factory of factory
        Vehicle vehicle = levelTwoFactory.getVehicleFactory("Ordinary").getVehicle("Maruthi");
        vehicle.average();
    }


}