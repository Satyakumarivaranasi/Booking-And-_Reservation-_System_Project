package BookingandReservationSystemHibernate.Service;

import com.satya.BookingandReservationSystemHibernate.Dao.*;

import BookingandReservationSystemHibernate.entity.*;

public class LocationService {
    private LocationDao locationDao;

    public LocationService() {
        locationDao = new LocationDao(null);
    }

    public void saveLocation(Location location) {
        locationDao.saveLocation(location);
    }

    public Location getLocation(int locationId) {
        return locationDao.getLocation(locationId);
    }

    public void updateLocation(Location location) {
        locationDao.updateLocation(location);
    }

    public void deleteLocation(int locationId) {
        locationDao.deleteLocation(locationId);
    }
}