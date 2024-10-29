package com.satya.BookingandReservationSystemHibernate.Dao;

import BookingandReservationSystemHibernate.entity.*;

public class BookingDao {
	public interface BookingDAO {
	    void saveBooking(Booking booking);
	    Booking getBooking(int bookingId);
	    void updateBooking(Booking booking);
	    void deleteBooking(int bookingId);
	}

	public BookingDao(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public Booking getBooking(int bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBooking(int bookingId) {
		// TODO Auto-generated method stub
		
	}


}
