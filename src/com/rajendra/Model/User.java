/**
 * 
 */
package com.rajendra.Model;

/**
 * @author rajendra
 *
 */
public class User extends Person{
	private Location location;


	public User(String userName, String sex, Number age, Location location) {
		super(userName,sex, age);
		this.location = location; 
	}
	
	public User(String userName, String sex, Number age) {
		super(userName, sex, age);
		this.location = null;
	}

	public double getDistance(Location location){
		if(this.location == null){
			System.out.println("Location is not yet location!");
			return -1;
		}
		else if(location == null){
			System.out.println("Invalid location");
			return -1;
		}
		else{
			double distanceX = Math.pow((this.location.getxCoord() - location.getxCoord()), 2);
			double distanceY = Math.pow((this.location.getyCoord() - location.getyCoord()), 2);
			return Math.sqrt(distanceX + distanceY);
		}
	}
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
}
