package com.satya.BookingandReservationSystemHibernate.Dao;


import BookingandReservationSystemHibernate.entity.*;

public class PaymentDao {
	public interface PaymentDAO {
	    void savePayment(Payments payment);
	    Payments getPayment(int paymentId);
	    void updatePayment(Payments  payment);
	    void deletePayment(int paymentId);
	}

	public PaymentDao(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void savePayment(Payments payment) {
		// TODO Auto-generated method stub
		
	}

	

	public void deletePayment(int paymentId) {
		// TODO Auto-generated method stub
		
	}

}
