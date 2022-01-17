/**
 * 
 */
package com.rajendra.Repository;

import com.rajendra.Model.Driver;
import com.rajendra.Model.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rajendra
 *
 */
public class DriverRepository {
	Map<String, Driver> drivers = new HashMap<String, Driver>();  // driverUserName - Driver

	public List<Driver> getAllDrivers(){
		return new ArrayList<Driver>(this.drivers.values());
	}
	public void addDriver(Driver driver) {
		if(this.drivers.containsKey(driver.getUserName())){
			System.out.println("Driver with given name, already exists!");
		}
		else {
			this.drivers.put(driver.getUserName(), driver);
		}
	}
	
	public void updateDriverLocation(String userName, Location location) {
		if(this.drivers.containsKey(userName)){
			this.drivers.get(userName).setLocation(location);
		}
		else {
			System.out.println("Driver with given name, doesn't exists!");
		}
	}

	public void updateDriverStatus(String userName, Boolean status) {
		if(this.drivers.containsKey(userName)){
			this.drivers.get(userName).setStatus(status);
		}
		else
			System.out.println("Driver with given name, doesn't exists!");
	}

	public void addEarning(String userName, double earning){
		if(this.drivers.containsKey(userName)){
			this.drivers.get(userName).addEarning(earning);
		}
	}

	public void findTotalEarning(){
		for(Driver driver : this.drivers.values()) {
			System.out.println(driver.getUserName() + " earn $" + driver.getEarning());
		}
	}
}
