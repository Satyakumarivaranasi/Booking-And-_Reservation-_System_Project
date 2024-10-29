package com.satya.BookingandReservationSystemHibernate.Dao;

import BookingandReservationSystemHibernate.entity.*;

public class CancellationRefundDao {
	public interface CancellationRefundDAO {
	    void saveCancellationRefund(CancellationRefunds cancellationRefund);
	    CancellationRefunds getCancellationRefund(int cancellationRefundId);
	    void updateCancellationRefund(CancellationRefunds cancellationRefund);
	    void deleteCancellationRefund(int cancellationRefundId);
	}

	public CancellationRefundDao(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void saveCancellationRefund(CancellationRefunds cancellationRefund) {
		// TODO Auto-generated method stub
		
	}

	

	public void deleteCancellationRefund(int cancellationRefundId) {
		// TODO Auto-generated method stub
		
	}

}
