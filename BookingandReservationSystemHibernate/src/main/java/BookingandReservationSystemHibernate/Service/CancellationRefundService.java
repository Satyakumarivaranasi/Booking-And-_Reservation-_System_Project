package BookingandReservationSystemHibernate.Service;

import com.satya.BookingandReservationSystemHibernate.Dao.*;

import BookingandReservationSystemHibernate.entity.*;

public class CancellationRefundService {
    private CancellationRefundDao cancellationRefundsDao;

    public CancellationRefundService() {
        cancellationRefundsDao = new CancellationRefundDao(null);
    }

    public void saveCancellationRefund(CancellationRefunds cancellationRefund) {
        cancellationRefundsDao.saveCancellationRefund(cancellationRefund);
    }



}