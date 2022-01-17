package com.rajendra.Model;
/**
 * @author rajendra
 *
 */
public class Booking {
    private  Location source;
    private  Location destination;
    private  String userName;
    private  String driverUserName;

    public Booking(Location source, Location destination, String userName, String driverUserName) {
        this.source = source;
        this.destination = destination;
        this.userName = userName;
        this.driverUserName = driverUserName;
    }

    public double getDistanceCovered(){
        double distanceX = Math.pow((this.source.getxCoord() - this.destination.getxCoord()), 2);
        double distanceY = Math.pow((this.source.getyCoord() - this.destination.getyCoord()), 2);
        return Math.sqrt(distanceX + distanceY);
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDriverUserName() {
        return driverUserName;
    }

    public void setDriverUserName(String driverUserName) {
        this.driverUserName = driverUserName;
    }
}
