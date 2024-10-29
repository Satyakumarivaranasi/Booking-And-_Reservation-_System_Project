package com.satya.BookingandReservationSystemHibernate.Dao;

import BookingandReservationSystemHibernate.entity.*;

public class LocationDao {
	public interface LocationDAO {
	    void saveLocation(Location location);
	    Location getLocation(int locationId);
	    void updateLocation(Location location);
	    void deleteLocation(int locationId);
	}

	public LocationDao(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void saveLocation(Location location) {
		// TODO Auto-generated method stub
		
	}

	public Location getLocation(int locationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateLocation(Location location) {
		// TODO Auto-generated method stub
		
	}

	public void deleteLocation(int locationId) {
		// TODO Auto-generated method stub
		
	}

}
