package com.satya.BookingandReservationSystemHibernate.Dao;

import org.hibernate.Session;

import BookingandReservationSystemHibernate.entity.*;

public class UserDao {
	public interface UserDAO {
	    void saveUser (User user);
	    User getUser (int userId);
	    void updateUser (User user);
	    void deleteUser (int userId);
	}

	public UserDao(Session session) {
		// TODO Auto-generated constructor stub
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

}
