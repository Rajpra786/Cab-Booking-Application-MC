/**
 * 
 */
package com.rajendra.Service;

import com.rajendra.Model.Driver;
import com.rajendra.Model.Location;
import com.rajendra.Model.User;
import com.rajendra.Model.Vehicle;
import com.rajendra.Repository.DriverRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajendra
 *
 */
public class DriverService {
	private DriverRepository driverRepository = new DriverRepository();

	public void addDriver(User driverDetails, Vehicle vehicle, Location location) {
		//create Driver
		Driver driver = new Driver(driverDetails,vehicle);
		driver.setLocation(location);
		driverRepository.addDriver(driver);
	}
	
	public void updateDriverLocation(String userName, Location location) {
		driverRepository.updateDriverLocation(userName, location);
	}
	
	public void changeDriverStatus(String userName, Boolean status) {
		driverRepository.updateDriverStatus(userName, status);
	}

	public List<Driver> getDriversAtGivenDistance(Location location, double distance){
		List<Driver> drivers = driverRepository.getAllDrivers();
		List<Driver> driversAtGivenDistance = new ArrayList<Driver>();

		for(Driver driver : drivers){
			double currentDistance = driver.getDistance(location);
			if(currentDistance != -1 && currentDistance < distance && driver.getStatus() == true){
				driversAtGivenDistance.add(driver);
			}
		}

		return driversAtGivenDistance;
	}

	public void addEarning(String userName, double earning){
		driverRepository.addEarning(userName, earning);
	}

	public void findTotalEarnings(){
		driverRepository.findTotalEarning();
	}
}
