/**
 * 
 */
package com.rajendra.Model;

/**
 * @author rajendra
 *
 */
public class Driver extends User{
	private Vehicle vehicle; 
	private Boolean status; // true : available , false: not-available
	private double earning;

	public double getEarning() {
		return earning;
	}

	public void setEarning(double earning) {
		this.earning = earning;
	}

	public void addEarning(double earning){
		this.earning += earning;
	}

	public Driver(String userName, String sex, Number age, Location location, Vehicle vehicle) {
		super(userName, sex, age, location);
		this.vehicle = vehicle; 
		this.status = true;
		this.earning = 0;
	}

	public Driver(User user, Vehicle vehicle){
		super(user.getUserName(), user.getSex(), user.getAge(),user.getLocation());
		this.vehicle = vehicle;
		this.status = true;
		this.earning = 0;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
