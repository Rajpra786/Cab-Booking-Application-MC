/**
 * 
 */
package com.rajendra.Service;

import com.rajendra.Model.Booking;
import com.rajendra.Model.Driver;
import com.rajendra.Model.Location;
import com.rajendra.Repository.BookingRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajendra
 *
 */
public class RideService {
    private BookingRepository bookingRepository = new BookingRepository();
    private double perUnitDistancePrice = 5;
    private double distance = 5;

    public List<Driver> findRide(String userName, Location source, Location destination,UserService userService, DriverService driverService){
        //first get userLocation
        Location userLocation  = userService.getUserLocation(userName);
        if(userLocation == null)
            return new ArrayList<>();

        return driverService.getDriversAtGivenDistance(userLocation, distance);
    }

    public Booking selectRide(String userName, String driverUserName, Location source, Location destination, DriverService driverService){
        Booking booking = new Booking(source, destination, userName, driverUserName);
        bookingRepository.createBooking(booking);

        // update driver status
        driverService.changeDriverStatus(driverUserName, false);
        return booking;
    }

    public double calculateBill(String userName, DriverService driverService) {
        Booking booking = bookingRepository.getLatestBooking(userName);

        double distance = booking.getDistanceCovered();

        double amount = distance * perUnitDistancePrice;
        driverService.addEarning(booking.getDriverUserName(), amount);
        return amount;
    }

    public Booking getLatestBooking(String userName){
        return bookingRepository.getLatestBooking(userName);
    }
}
