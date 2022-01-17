package com.rajendra;

import com.rajendra.Model.Location;
import com.rajendra.Model.User;
import com.rajendra.Model.Vehicle;

public class DriverClass {
    public static void main(String[] args){
        CabBookingApplication cabBookingApplication = new CabBookingApplication(); // command pattern

        // user 1
        cabBookingApplication.addUser(new User("Abhishek","M",23));
        cabBookingApplication.updateUserLocation("Abhishek", new Location(0, 0));

        //user 2
        cabBookingApplication.addUser(new User("Rahul", "M", 29));
        cabBookingApplication.updateUserLocation("Rahul", new Location(10, 0));

        //user 3
        cabBookingApplication.addUser(new User("Nandini", "F", 22, new Location(15, 6)));

        //driver 1
        cabBookingApplication.addDriver(
                new User("Driver1", "M", 22),
                new Vehicle("Swift", "KA-01-12345"),
                new Location(10,1));

        //driver 2
        cabBookingApplication.addDriver(
                new User("Driver2", "M", 29),
                new Vehicle("Swift", "KA-01-12346"),
                new Location(11,10));

        //driver 3
        cabBookingApplication.addDriver(
                new User("Driver3", "M", 24),
                new Vehicle("Swift", "KA-01-12347"),
                new Location(5,3));

        //search
        cabBookingApplication.findRide(
                "Abhishek",
                new Location(0, 0),
                new Location(20,1));

        cabBookingApplication.findRide(
                "Rahul",
                new Location(10, 0),
                new Location(15, 3)
        );

        cabBookingApplication.chooseRide(
                "Rahul",
                "Driver1",
                new Location(10, 0),
                new Location(15, 3));

        cabBookingApplication.calculateBill("Rahul");

        cabBookingApplication.updateDriverStatus("Driver1", false);

        cabBookingApplication.findRide(
                "Nandini",
                new Location(15, 6),
                new Location(20, 4)
        );

        cabBookingApplication.findTotalEarning();
    }
}
