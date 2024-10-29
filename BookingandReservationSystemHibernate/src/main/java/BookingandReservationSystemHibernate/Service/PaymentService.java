package BookingandReservationSystemHibernate.Service;

import com.satya.BookingandReservationSystemHibernate.Dao.*;

import BookingandReservationSystemHibernate.entity.*;

public class PaymentService {
    private PaymentDao paymentsDao;

    public PaymentService() {
        paymentsDao = new PaymentDao(null);
    }

    public void savePayment(Payments payment) {
        paymentsDao.savePayment(payment);
    }


    public void deletePayment(int paymentId) {
        paymentsDao.deletePayment(paymentId);
    }
}