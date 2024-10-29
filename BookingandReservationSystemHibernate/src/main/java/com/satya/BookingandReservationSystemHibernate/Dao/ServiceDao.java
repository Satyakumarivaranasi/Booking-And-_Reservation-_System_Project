package com.satya.BookingandReservationSystemHibernate.Dao;

import BookingandReservationSystemHibernate.entity.*;

public class ServiceDao {

public ServiceDao(Object object) {
		// TODO Auto-generated constructor stub
	}

public interface ServiceDAO {
    void saveService(Service service);
    Service getService(int serviceId);
    void updateService(Service service);
    void deleteService(int serviceId);
}

public void saveService(Service service) {
	// TODO Auto-generated method stub
	
}

public Service getService(int serviceId) {
	// TODO Auto-generated method stub
	return null;
}

public void updateService(Service service) {
	// TODO Auto-generated method stub
	
}

public void deleteService(int serviceId) {
	// TODO Auto-generated method stub
	
}

}
