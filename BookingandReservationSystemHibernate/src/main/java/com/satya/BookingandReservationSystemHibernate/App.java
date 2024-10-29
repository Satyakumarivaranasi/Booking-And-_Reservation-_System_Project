package com.satya.BookingandReservationSystemHibernate;

import java.math.BigDecimal;
import  BookingandReservationSystemHibernate.entity.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import BookingandReservationSystemHibernate.entity.Booking;
import BookingandReservationSystemHibernate.entity.CancellationRefunds;
import BookingandReservationSystemHibernate.entity.Location;
import BookingandReservationSystemHibernate.entity.Payments;
import BookingandReservationSystemHibernate.entity.Review;
import BookingandReservationSystemHibernate.entity.Service;
import BookingandReservationSystemHibernate.entity.User;

public class App {
    public static void main(String[] args) {
        // Hibernate Configuration
        Configuration con = new Configuration().configure()
                          .addAnnotatedClass(User.class)
                          .addAnnotatedClass(Booking.class)
                          .addAnnotatedClass(Service.class)
                          .addAnnotatedClass(Location.class)
                          .addAnnotatedClass(Review.class)
                          .addAnnotatedClass(Payments.class)
                          .addAnnotatedClass(CancellationRefunds.class);
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Scanner myInput = new Scanner(System.in);
        int userMainChoice = 0;
        int passChoice=0;
        String admin="Admin";
        String adminPass="Adminpassword";
        String userLogin="Satya";
        String userPass="SatyaPass";
        while(passChoice!=3) {
        	System.out.println("Welcome to User login type:");
        	System.out.println("1.Admin");
        	System.out.println("2.user");
        	System.out.println("3.exit");
        	System.out.print("Enter Your User login type:");
        	passChoice= myInput.nextInt();
        	
        	switch(passChoice) {
        	case 1: 
        		System.out.println("Admin:");
        		String typeAdmin = myInput.next();
        		System.out.println("Password:");
        		String typepasswordAdmin = myInput.next();
        		if(typeAdmin.equalsIgnoreCase(admin)&& typepasswordAdmin.equalsIgnoreCase(adminPass))
        		{
        	        
        		
        		while (userMainChoice != 4) {
                System.out.println("Booking & Reservation System");
                System.out.println("1. Insertion");
                System.out.println("2. Updation");
                System.out.println("3. Deletion");
                System.out.println("4. Exit");
                System.out.print("Enter Your choice: ");
                userMainChoice = myInput.nextInt();

                Transaction tx = null;

                switch (userMainChoice) {
                    case 1:
                        // Create Operation
                        tx = session.beginTransaction();
                        createEntities(session);
                        tx.commit();
                        break;
                    case 2:
                        // Update Operation
                        tx = session.beginTransaction();
                        updateEntities(session);
                        tx.commit();
                        break;
                    case 3:
                        // Delete Operation
                        tx = session.beginTransaction();
                        deleteEntities(session);
                        tx.commit();
                        break;
                    case 4:
                        System.out.println("Thanks for using Booking & Reservation System.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please check your given data. It must be 1, 2, 3, or 4.");
                }
        		}
        		
        		
            }
            break;
            
        	case 2:
        		System.out.println("User:");
        		String typeUser = myInput.next();
        		System.out.println("Password:");
        		String typepasswordUser = myInput.next();
        		if(typeUser.equalsIgnoreCase(userLogin)&& typepasswordUser.equalsIgnoreCase(userPass))
        		{
        		
        		
        		while (userMainChoice != 4) {
                System.out.println("Booking & Reservation System");
                System.out.println("1. Insertion");
                System.out.println("2. Updation");
                System.out.println("3. Deletion");
                System.out.println("4. Exit");
                System.out.print("Enter Your choice: ");
                userMainChoice = myInput.nextInt();

                Transaction tx = null;

                switch (userMainChoice) {
                    case 1:
                        // Create Operation
                        tx = session.beginTransaction();
                        createEntities(session);
                        tx.commit();
                        break;
                    case 2:
                        // Update Operation
                        tx = session.beginTransaction();
                        updateEntities(session);
                        tx.commit();
                        break;
                    case 3:
                        // Delete Operation
                        tx = session.beginTransaction();
                        deleteEntities(session);
                        tx.commit();
                        break;
                    case 4:
                        System.out.println("Thanks for using Booking & Reservation System.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please check your given data. It must be 1, 2, 3, or 4.");
                }
            }
        		}
              break;
        	case 3: System.out.println("Thanks for using Booking & Reservation System..");
        	        break;
        	default:
        		     System.out.println("Invalid Choice. please check your Given user type..");
        	}
        	
        }
        
        

        
        session.close();
        sf.close();
        myInput.close();
    }   
    
    
    private static void createEntities(Session session) {
        
        Scanner input = new Scanner(System.in);
   
            User user = null;
            Service service = null;
            Booking booking = null;
            
            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class) 
                    .buildSessionFactory();
            
            Session session1 = null;
            Transaction transaction = null;
           

            try {
            	session1 = factory.openSession();
                transaction = session1.beginTransaction();
     
            
            // Load existing User and Service
           
            System.out.println("1.Add user Data");
            System.out.println("2.Add Service Data");
            System.out.println("3.Add Booking Details");
            System.out.println("4.Location");
            System.out.println("5.Review");
            System.out.println("6.Payment Details");
            System.out.println("7.Cancellation Refunds");
            System.out.println("8.Exit");
            System.out.print("Enter your Choice: ");
            int userChoice = input.nextInt();
            input.nextLine(); // To consume the newline character

            switch (userChoice) {
                case 1:
                    System.out.println("Welcome TO Add User Data...");
                    user = new User();
                    
                    System.out.print("Enter User Email Address: ");
                    String userEmail = input.next();
                    input.nextLine(); // To consume the newline character
                    
                    System.out.print("Enter User Name: ");
                    String userName = input.nextLine();
                    
                    System.out.print("Enter User Phone Number: ");
                    String userPhone = input.nextLine();
                    
                   
                    
                    user.setEmail(userEmail);
                    user.setName(userName);
                    user.setPhone(userPhone);
                    user.setUserID(1);
                    
                    session.save(user);
                    break;

                case 2:
                    System.out.println("Welcome TO Add Service Data...");
                    service = new Service();
                    
                    System.out.print("Enter Service Name: ");
                    String serviceName = input.nextLine();
                    
                    
                    
                    System.out.print("Enter Service Price: ");
                    int servicePrice = input.nextInt();
                    BigDecimal bigDecimalValue = new BigDecimal(servicePrice);
                    BigDecimal formattedValue = bigDecimalValue.setScale(2, BigDecimal.ROUND_HALF_UP);
                    String str1 = String.valueOf(formattedValue);
                    input.nextLine(); // To consume the newline character
                    
                    System.out.print("Enter Service Description: ");
                    String serviceDescription = input.nextLine();
                    
                    service.setName(serviceName);
                    service.setServiceID(1);
                    service.setPrice(new BigDecimal(str1));
                    service.setDescription(serviceDescription);
                    
                    session.save(service);
                    break;

                case 3:
                    System.out.println("Welcome TO Add Booking Details...");
                    
                    booking = new Booking();
                    
                    
                    System.out.print("Enter User Id: ");
                    int userId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Service Id: ");
                    int serviceId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Booking Status: ");
                    String bookingStatus = input.nextLine();
                    
                   
                    
                    
                   
                    User user1 = session.get(User.class, userId);
                    if (user1 != null) {
                        System.out.println("User retrieved: " + user1);
                        // Process the user object as needed
                    } else {
                        System.out.println("User with ID " + userId + " not found.");
                    }
                    
                    Service service1 = session.get(Service.class, serviceId);
                      if (service1 != null) {
                        System.out.println("Service retrieved: " + service1);
                        // Process the user object as needed
                    } else {
                        System.out.println("Service with ID " + serviceId + " not found.");
                    }
                      int bookingId = 1;
                      Booking booking1 = session.get(Booking.class, bookingId);
                         if (booking1 != null) {
                          System.out.println("Service retrieved: " + booking1);
                          // Process the user object as needed
                      } else {
                          System.out.println("Service with ID " + bookingId + " not found.");
                      }

                    transaction.commit();
                    
                 
                    
                     // To consume the newline character
                    
                    
                    booking.setBookingID(1);
                    booking.setDate(new Date());
                    booking.setService(service1);
                    booking.setStatus(bookingStatus);
                    booking.setUser(user1);
                    
                    session.save(booking);
                    break;

                case 4:
                    System.out.println("Welcome TO Location...");
                    Location location = new Location();
                    
                 
                    // To consume the newline character
                    
                    System.out.print("Enter City: ");
                    String locationCity = input.nextLine();
                    input.nextLine(); 
                    
                    System.out.print("Enter Street Name: ");
                    String locationName = input.nextLine();
                    
                    System.out.print("Enter Address: ");
                    String locationAddress = input.nextLine();
                    
                    System.out.print("Enter Country: ");
                    String locationCountry = input.nextLine();
                    
                    location.setLocationID(1);
                    location.setCity(locationCity);
                    location.setName(locationName);
                    location.setAddress(locationAddress);
                    location.setCountry(locationCountry);
                    
                    session.save(location);
                    break;

                case 5:
                    System.out.println("Welcome TO Write the Review...");
                    Review review = new Review();
                    
                  
                    
                    System.out.print("Enter Rating: ");
                    int reviewRating = input.nextInt();
                    input.nextLine(); // To consume the newline character
                    
                    System.out.print("Enter Comment: ");
                    String reviewComment = input.nextLine();

                    System.out.print("Enter User Id: ");
                    int userId2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter Service Id: ");
                    int serviceId2 = input.nextInt();
                   
                    
                    
                   
                    User user2 = session.get(User.class, userId2);
                    if (user2 != null) {
                        System.out.println("User retrieved: " + user2);
                        // Process the user object as needed
                    } else {
                        System.out.println("User with ID " + userId2 + " not found.");
                    }
                    
                    Service service2 = session.get(Service.class, serviceId2);
                      if (service2 != null) {
                        System.out.println("Service retrieved: " + service2);
                        // Process the user object as needed
                    } else {
                        System.out.println("Service with ID " + serviceId2 + " not found.");
                    }
                      

                    transaction.commit();
                    

                    
                    review.setReviewID(1);
                    review.setRating(reviewRating);
                    review.setComment(reviewComment);
                    review.setService(service2);
                    review.setuser(user2);
                    
                    session.save(review);
                    break;

                case 6:
                    System.out.println("Welcome To check The Payment Details...");
                    Payments payment = new Payments();
                    
                   
                    
                    System.out.print("Enter Amount: ");
                    int paymentAmount = input.nextInt();
                    BigDecimal bigDecimalValue2 = new BigDecimal(paymentAmount);
                    BigDecimal formattedValue2 = bigDecimalValue2.setScale(2, BigDecimal.ROUND_HALF_UP);
                    String str2 = String.valueOf(formattedValue2);
                    input.nextLine(); // To consume the newline character
                    
                    System.out.print("Enter Payment Method: ");
                    String paymentMethod = input.nextLine();
                    
                    System.out.println("Enter booking id:");
                    int bookingId2 = input.nextInt();
                   
                    Booking booking2 = session.get(Booking.class, bookingId2);
                       if (booking2 != null) {
                        System.out.println("Service retrieved: " + booking2);
                        // Process the user object as needed
                    } else {
                        System.out.println("Service with ID " + bookingId2 + " not found.");
                    }
                       
                       transaction.commit();
                    payment.setPaymentID(1);
                    payment.setPaymentDate(new Date());
                    payment.setBooking(booking2);
                    payment.setAmount(new BigDecimal(str2));
                    payment.setPaymentMethod(paymentMethod);
                    
                    session.save(payment);
                    break;

                case 7:
                    System.out.println("Welcome TO Cancellation Refund...");
                    CancellationRefunds refund = new CancellationRefunds();
                    
                    System.out.print("Enter cancellation Refund Amount: ");
                    int cancellationRefundId = input.nextInt();
                    BigDecimal bigDecimalValue3 = new BigDecimal(cancellationRefundId);
                    BigDecimal formattedValue3 = bigDecimalValue3.setScale(2, BigDecimal.ROUND_HALF_UP);
                    String str3 = String.valueOf(formattedValue3);
                    // To consume the newline character
                    
                   
                   
                    
                    System.out.println("Enter booking id:");
                    int bookingId3 = input.nextInt();
                   
                    Booking booking3 = session.get(Booking.class, bookingId3);
                       if (booking3 != null) {
                        System.out.println("Service retrieved: " + booking3);
                        // Process the user object as needed
                    } else {
                        System.out.println("Service with ID " + bookingId3 + " not found.");
                    }
                       
                       transaction.commit();
                    
                    refund.setCancellationRefundID(1);
                    refund.setCancellationDate(new Date());
                    refund.setBooking(booking3);
                    refund.setRefundAmount(new BigDecimal(str3));
                    
                    session.save(refund);
                    break;

                default:
                    System.out.println("Please check your Given Data. It must be 1, 2, 3, 4, 5, 6, 7, or 8");
            
        }
            }
            catch (Exception e) {
                // Rollback transaction in case of error
                if (transaction != null && transaction.isActive()) {
                    transaction.rollback();
                }
                e.printStackTrace();
            } finally {
                // Close the session
                if (session1 != null && session1.isOpen()) {
                    session1.close();
                }
                factory.close();
            }
    }

      
    // Create Method
   //        
//    // Read Method
//    private static void readEntities(Session session) {
//        // Example of reading entities
//        User user = session.get(User.class, 1);
//        if (user != null) {
//            System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
//        }
//        
//        Service service = session.get(Service.class, 1);
//        if (service != null) {
//            System.out.println("Service: " + service.getName() + ", Price: " + service.getPrice());
//        }
//    }
    
    
    private static void updateEntities(Session session) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose entity to update:");
        System.out.println("1. User");
        System.out.println("2. Service");
        System.out.println("3. Booking");
        System.out.println("4. Location");
        System.out.println("5. Review");
        System.out.println("6. Payment");
        System.out.println("7. CancellationRefund");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter User ID to update: ");
                int userId = input.nextInt();
                User user = session.get(User.class, userId);
                if (user != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new User Name: ");
                    String newName = input.nextLine();
                    user.setName(newName);
                    session.update(user);
                    System.out.println("User updated successfully.");
                } else {
                    System.out.println("User not found.");
                }
                break;

            case 2:
                System.out.print("Enter Service ID to update: ");
                int serviceId = input.nextInt();
                Service service = session.get(Service.class, serviceId);
                if (service != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new Service Name: ");
                    String newServiceName = input.nextLine();
                    service.setName(newServiceName);
                    session.update(service);
                    System.out.println("Service updated successfully.");
                } else {
                    System.out.println("Service not found.");
                }
                break;

            case 3:
                System.out.print("Enter Booking ID to update: ");
                int bookingId = input.nextInt();
                Booking booking = session.get(Booking.class, bookingId);
                if (booking != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new Booking Date (YYYY-MM-DD): ");
                    String newBookingDate = input.nextLine();
                    booking.setBookingDate(LocalDate.parse(newBookingDate));
                    session.update(booking);
                    System.out.println("Booking updated successfully.");
                } else {
                    System.out.println("Booking not found.");
                }
                break;

            case 4:
                System.out.print("Enter Location ID to update: ");
                int locationId = input.nextInt();
                Location location = session.get(Location.class, locationId);
                if (location != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new Location Name: ");
                    String newLocationName = input.nextLine();
                    location.setName(newLocationName);
                    session.update(location);
                    System.out.println("Location updated successfully.");
                } else {
                    System.out.println("Location not found.");
                }
                break;

            case 5:
                System.out.print("Enter Review ID to update: ");
                int reviewId = input.nextInt();
                Review review = session.get(Review.class, reviewId);
                if (review != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new Review Comment: ");
                    String newReviewComment = input.nextLine();
                    review.setComment(newReviewComment);
                    session.update(review);
                    System.out.println("Review updated successfully.");
                } else {
                    System.out.println("Review not found.");
                }
                break;

            case 6:
                System.out.print("Enter Payment ID to update: ");
                int paymentId = input.nextInt();
                Payments payment = session.get(Payments.class, paymentId);
                if (payment != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new Payment Amount: ");
                    double newPaymentAmount = input.nextDouble();

                    BigDecimal bigDecimalValue = new BigDecimal(newPaymentAmount);
                    BigDecimal formattedValue = bigDecimalValue.setScale(2, BigDecimal.ROUND_HALF_UP);

                    String str = String.valueOf(formattedValue);
                    payment.setAmount(new BigDecimal(str));
                    session.update(payment);
                    System.out.println("Payment updated successfully.");
                } else {
                    System.out.println("Payment not found.");
                }
                break;

            case 7:
                System.out.print("Enter CancellationRefund ID to update: ");
                int refundId = input.nextInt();
                CancellationRefunds refund = session.get(CancellationRefunds.class, refundId);
                if (refund != null) {
                    input.nextLine(); // Consume newline
                    System.out.print("Enter new Refund Amount: ");
                    double newRefundAmount = input.nextDouble();

                    BigDecimal bigDecimalValue = new BigDecimal(newRefundAmount);
                    BigDecimal formattedValue = bigDecimalValue.setScale(2, BigDecimal.ROUND_HALF_UP);

                    String str = String.valueOf(formattedValue);
                    refund.setRefundAmount(new BigDecimal(str));
                    session.update(refund);
                    System.out.println("CancellationRefund updated successfully.");
                } else {
                    System.out.println("CancellationRefund not found.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please check your input.");
        }
    }

 // Delete Method with User Input
    private static void deleteEntities(Session session) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose entity to delete:");
        System.out.println("1. User");
        System.out.println("2. Service");
        System.out.println("3. Booking");
        System.out.println("4. Location");
        System.out.println("5. Review");
        System.out.println("6. Payment");
        System.out.println("7. CancellationRefund");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter User ID to delete: ");
                int userId = input.nextInt();
                User user = session.get(User.class, userId);
                if (user != null) {
                    session.delete(user);
                    System.out.println("User deleted successfully.");
                } else {
                    System.out.println("User not found.");
                }
                break;

            case 2:
                System.out.print("Enter Service ID to delete: ");
                int serviceId = input.nextInt();
                Service service = session.get(Service.class, serviceId);
                if (service != null) {
                    session.delete(service);
                    System.out.println("Service deleted successfully.");
                } else {
                    System.out.println("Service not found.");
                }
                break;

            case 3:
                System.out.print("Enter Booking ID to delete: ");
                int bookingId = input.nextInt();
                Booking booking = session.get(Booking.class, bookingId);
                if (booking != null) {
                    session.delete(booking);
                    System.out.println("Booking deleted successfully.");
                } else {
                    System.out.println("Booking not found.");
                }
                break;

            case 4:
                System.out.print("Enter Location ID to delete: ");
                int locationId = input.nextInt();
                Location location = session.get(Location.class, locationId);
                if (location != null) {
                    session.delete(location);
                    System.out.println("Location deleted successfully.");
                } else {
                    System.out.println("Location not found.");
                }
                break;

            case 5:
                System.out.print("Enter Review ID to delete: ");
                int reviewId = input.nextInt();
                Review review = session.get(Review.class, reviewId);
                if (review != null) {
                    session.delete(review);
                    System.out.println("Review deleted successfully.");
                } else {
                    System.out.println("Review not found.");
                }
                break;

            case 6:
                System.out.print("Enter Payment ID to delete: ");
                int paymentId = input.nextInt();
                Payments payment = session.get(Payments.class, paymentId);
                if (payment != null) {
                    session.delete(payment);
                    System.out.println("Payment deleted successfully.");
                } else {
                    System.out.println("Payment not found.");
                }
                break;

            case 7:
                System.out.print("Enter CancellationRefund ID to delete: ");
                int refundId = input.nextInt();
                CancellationRefunds refund = session.get(CancellationRefunds.class, refundId);
                if (refund != null) {
                    session.delete(refund);
                    System.out.println("CancellationRefund deleted successfully.");
                } else {
                    System.out.println("CancellationRefund not found.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please check your input.");
        }
    }   
}
