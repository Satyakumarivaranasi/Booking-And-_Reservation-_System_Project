package BookingandReservationSystemHibernate.Service;

import org.hibernate.Session;

import com.satya.BookingandReservationSystemHibernate.Dao.*;

import BookingandReservationSystemHibernate.entity.*;

public class UserService {
	    private UserDao userDao;

	    public UserService(Session session) {
	        userDao = new UserDao(session);
	    }

	    public UserService() {
			// TODO Auto-generated constructor stub
		}

		public void saveUser (User user) {
	        userDao.saveUser (user);
	    }

	    public User getUser (int userId) {
	        return userDao.getUser (userId);
	    }

	    public void updateUser (User user) {
	        userDao.updateUser (user);
	    }

	    public void deleteUser (int userId) {
	        userDao.deleteUser (userId);
	    }
	}


