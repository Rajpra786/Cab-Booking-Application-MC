/**
 * 
 */
package com.rajendra.Model;

/**
 * @author rajendra
 *
 */
public class Location {
	public Location(Integer xCoord, Integer yCoord) {
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public Integer getxCoord() {
		return xCoord;
	}
	public void setxCoord(Integer xCoord) {
		this.xCoord = xCoord;
	}
	
	public Integer getyCoord() {
		return yCoord;
	}
	public void setyCoord(Integer yCoord) {
		this.yCoord = yCoord;
	}
	
	private Integer xCoord; 
	private Integer yCoord; 
	
	
}
