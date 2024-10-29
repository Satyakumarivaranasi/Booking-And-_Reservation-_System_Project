package BookingandReservationSystemHibernate.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CancellationRefunds")
public class CancellationRefunds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cancellationRefundID;

    @ManyToOne
    @JoinColumn(name = "BookingID")
    private Booking booking;

    @Column(name = "CancellationDate")
    private Date cancellationDate;

    @Column(name = "RefundAmount")
    private BigDecimal refundAmount;
 // Getters and Setters
	public int getCancellationRefundID() {
		return cancellationRefundID;
	}

	public void setCancellationRefundID(int cancellationRefundID) {
		this.cancellationRefundID = cancellationRefundID;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Date getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}
    
}
