package withStrategyPattern;

import withStrategyPattern.drivestrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }

}
