package Entity;

import java.time.LocalDate;

public class Booking {

	private int bookingId;
	private LocalDate fromDate;
	private Property bookedProp;
	
	public Booking() {
		super();
	}

	public Booking(int bookingId, LocalDate fromDate, Property bookedProp) {
		super();
		this.bookingId = bookingId;
		this.fromDate = fromDate;
		this.bookedProp = bookedProp;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public Property getBookedProp() {
		return bookedProp;
	}

	public void setBookedProp(Property bookedProp) {
		this.bookedProp = bookedProp;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", fromDate=" + fromDate + ", bookedProp=" + bookedProp + "]";
	}
	
	
	
}
