package withStrategyPattern.drivestrategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("this is Special drive");

    }
}
