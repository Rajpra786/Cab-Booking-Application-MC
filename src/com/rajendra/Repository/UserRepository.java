/**
 * 
 */
package com.rajendra.Repository;

import java.util.HashMap;

import com.rajendra.Model.Location;
import com.rajendra.Model.User;

/**
 * @author rajendra
 *
 */
public class UserRepository {
	private HashMap<String, User> users; 
	
	public UserRepository() {
		this.users = new HashMap<String, User>(); 
	}
	
	public void addUser(User user) {
		if(this.users.containsKey(user.getUserName())) {
			System.out.println("User with given name, already exists!");
		}
		else {
			this.users.put(user.getUserName(), user);
		}
	}

	public void updateUser(String userName, User user){
		if(this.users.containsKey(userName)) {
			this.users.remove(userName);
			this.users.put(user.getUserName(), user);
		}
		else {
			System.out.println("User with given name, doesn't exists!");
		}
	}

	public void updateUserLocation(String userName, Location location){
		if(this.users.containsKey(userName)) {
			this.users.get(userName).setLocation(location);
		}
		else {
			System.out.println("User with given name, doesn't exists!");
		}
	}

	public User getUser(String userName){
		return this.users.get(userName);
	}

	public Location getUserLocation(String userName){
		if(this.users.containsKey(userName)){
			return this.users.get(userName).getLocation();
		}
		else{
			System.out.println("User with given name doesn't exist");
			return null;
		}
	}
}
