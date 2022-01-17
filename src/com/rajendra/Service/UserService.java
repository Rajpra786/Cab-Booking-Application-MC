/**
 * 
 */
package com.rajendra.Service;

import com.rajendra.Model.Location;
import com.rajendra.Model.User;
import com.rajendra.Repository.UserRepository;

/**
 * @author rajendra
 *
 */
public class UserService {
	private UserRepository userRepository = new UserRepository();

	public void addUser(User user) {
		userRepository.addUser(user);
	}
	
	public void updateUser(String userName, User userDetails) {
		userRepository.updateUser(userName, userDetails);
	}
	
	public void updateUserLocation(String userName, Location location) {
		userRepository.updateUserLocation(userName, location);
	}

	public Location getUserLocation(String userName){
		return userRepository.getUserLocation(userName);
	}
}
