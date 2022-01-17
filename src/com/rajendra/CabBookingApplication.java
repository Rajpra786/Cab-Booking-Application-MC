/**
 * 
 */
package com.rajendra;

import com.rajendra.Model.*;
import com.rajendra.Service.DriverService;
import com.rajendra.Service.RideService;
import com.rajendra.Service.UserService;

import java.util.List;

/**
 * @author rajendra
 *
 */
public class CabBookingApplication {
	private static RideService rideService = new RideService();
	private static UserService userService = new UserService();
	private static DriverService driverService = new DriverService();


	//User related methods
	public void addUser(User user){
		userService.addUser(user);
	}
	public void updateUser(String userName, User user){
		userService.updateUser(userName, user);
	}
	public void updateUserLocation(String userName, Location location){
		userService.updateUserLocation(userName,location);
	}


	//Driver related methods
	public void addDriver(User user, Vehicle vehicle, Location location){
		driverService.addDriver(user, vehicle, location);
	}

	public void updateDriverLocation(String userName, Location location){
		driverService.updateDriverLocation(userName, location);
	}

	public void updateDriverStatus(String userName, Boolean status){
		driverService.changeDriverStatus(userName, status);
	}


	public void findRide(String userName, Location source, Location destination){
		List<Driver> availableDrivers = rideService.findRide(userName, source, destination, userService, driverService);
		if(availableDrivers == null || availableDrivers.size() == 0)
		{
			System.out.println("No ride found!");
			return;
		}

		for(Driver driver : availableDrivers){
			System.out.println(driver.getUserName());
		}
	}

	public void chooseRide(String userName, String driverUserName, Location source, Location destination){
		Booking booking = rideService.selectRide(userName, driverUserName, source, destination, driverService);
		if(booking != null){
			System.out.println("Ride Started");
		}
		else{
			System.out.println("Booking was unsuccessful!");
		}
	}

	public void calculateBill(String userName){
		double amount = rideService.calculateBill(userName, driverService);
		System.out.println("Ride ended! Bill Amount $"+amount);

		//update locations
		Booking booking = rideService.getLatestBooking(userName);
		userService.updateUserLocation(userName, booking.getDestination());
		driverService.updateDriverLocation(booking.getDriverUserName(), booking.getDestination());

		//update driver status
		driverService.changeDriverStatus(booking.getDriverUserName(), true);
	}

	public void findTotalEarning(){
		driverService.findTotalEarnings();
	}
}
