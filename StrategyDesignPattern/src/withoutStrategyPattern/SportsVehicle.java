package withoutStrategyPattern;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("this is special drive");
    }

    @Override
    public void display() {
        System.out.println("this is special display");

    }
}
