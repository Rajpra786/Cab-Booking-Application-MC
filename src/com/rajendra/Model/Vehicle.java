/**
 * 
 */
package com.rajendra.Model;


/**
 * @author rajendra
 *
 */
public class Vehicle {
	private String name;
	private String registrationNumber;


	public Vehicle(String name, String registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}
