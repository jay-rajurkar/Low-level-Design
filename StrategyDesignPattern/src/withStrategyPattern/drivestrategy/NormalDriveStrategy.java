package withStrategyPattern.drivestrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("this is Normal drive");
    }
}
