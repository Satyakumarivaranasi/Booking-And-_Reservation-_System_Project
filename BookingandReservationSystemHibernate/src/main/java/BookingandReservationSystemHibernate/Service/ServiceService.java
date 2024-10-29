package BookingandReservationSystemHibernate.Service;

import com.satya.BookingandReservationSystemHibernate.Dao.*;

import BookingandReservationSystemHibernate.entity.*;

public class ServiceService {
    private ServiceDao serviceDao;

    public ServiceService() {
        serviceDao = new ServiceDao(null);
    }

    public void saveService(Service service) {
        serviceDao.saveService(service);
    }

    public Service getService(int serviceId) {
        return serviceDao.getService(serviceId);
    }

    public void updateService(Service service) {
        serviceDao.updateService(service);
    }

    public void deleteService(int serviceId) {
        serviceDao.deleteService(serviceId);
    }
}