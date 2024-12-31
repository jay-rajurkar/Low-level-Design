package withoutStrategyPattern;

public class PassengerVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("This has Normal Drive");
    }

    @Override
    public void display() {
        System.out.println("This has normal Display");
    }
}
