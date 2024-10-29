package BookingandReservationSystemHibernate.Service;

import com.satya.BookingandReservationSystemHibernate.Dao.*;
import BookingandReservationSystemHibernate.entity.*;

public class ReviewService {
    private ReviewDao reviewDao;

    public ReviewService() {
        reviewDao = new ReviewDao(null);
    }

    public void saveReview(Review review) {
        reviewDao.saveReview(review);
    }

    public Review getReview(int reviewId) {
        return reviewDao.getReview(reviewId);
    }

    public void updateReview(Review review) {
        reviewDao.updateReview(review);
    }

    public void deleteReview(int reviewId) {
        reviewDao.deleteReview(reviewId);
    }
}