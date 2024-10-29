package com.satya.BookingandReservationSystemHibernate.Dao;

import BookingandReservationSystemHibernate.entity.*;

public class ReviewDao {
	public interface ReviewDAO {
	    void saveReview(Review review);
	    Review getReview(int reviewId);
	    void updateReview(Review review);
	    void deleteReview(int reviewId);
	}

	public ReviewDao(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void saveReview(Review review) {
		// TODO Auto-generated method stub
		
	}

	public Review getReview(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateReview(Review review) {
		// TODO Auto-generated method stub
		
	}

	public void deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		
	}

}
