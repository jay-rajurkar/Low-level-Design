package withStrategyPattern;

import withStrategyPattern.drivestrategy.DriveStrategy;

public class Vehicle {

    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    };
    public void display(){

    };
}
