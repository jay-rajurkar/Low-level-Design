package withStrategyPattern;

import withStrategyPattern.drivestrategy.DriveStrategy;
import withStrategyPattern.drivestrategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{


    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }

}
