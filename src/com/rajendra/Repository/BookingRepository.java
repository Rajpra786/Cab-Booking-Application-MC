package com.rajendra.Repository;

import com.rajendra.Model.Booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingRepository {
    private Map<String, List<Booking>> bookings; //username - booking

    public BookingRepository(){
        this.bookings = new HashMap<String, List<Booking>>();
    }

    public void createBooking(Booking booking){
        if(!this.bookings.containsKey(booking.getUserName())){
            this.bookings.put(booking.getUserName(),new ArrayList<>());
        }

        this.bookings.get(booking.getUserName()).add(booking);
    }

    public Booking getLatestBooking(String userName){
        List<Booking> bookings = this.bookings.get(userName);
        if(bookings != null && bookings.size() > 0){
            return bookings.get(bookings.size()-1);
        }
        else
            return null;
    }

}
