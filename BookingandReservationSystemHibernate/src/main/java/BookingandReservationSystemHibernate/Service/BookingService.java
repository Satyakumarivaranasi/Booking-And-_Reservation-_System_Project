package BookingandReservationSystemHibernate.Service;

import com.satya.BookingandReservationSystemHibernate.Dao.*;

import BookingandReservationSystemHibernate.entity.*;

public class BookingService {
    private BookingDao bookingDao;

    public BookingService() {
        bookingDao = new BookingDao(null);
    }

    public void saveBooking(Booking booking) {
        bookingDao.saveBooking(booking);
    }

    public Booking getBooking(int bookingId) {
        return bookingDao.getBooking(bookingId);
    }

    public void updateBooking(Booking booking) {
        bookingDao.updateBooking(booking);
    }

    public void deleteBooking(int bookingId) {
        bookingDao.deleteBooking(bookingId);
    }
}
