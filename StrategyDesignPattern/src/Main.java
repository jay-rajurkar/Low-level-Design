import withStrategyPattern.PassengerVehicle;
import withStrategyPattern.SportsVehicle;
import withStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}