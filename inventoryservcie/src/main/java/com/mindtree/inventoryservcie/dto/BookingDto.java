package com.mindtree.inventoryservcie.dto;

public class BookingDto {
	private long bookingId;
	private String userId;
	private String movieId;
	private String screenId;
	private String showId;
	private String theatreId;
	private int noOfTicketsWantToBook;

	public BookingDto() {
		super();
		// TODO Auto-generated constructor stub
	}
//
//	public BookingDto(long bookingId, String userId, String movieId, String screenId, String showId, String theatreId) {
//		super();
//		this.bookingId = bookingId;
//		this.userId = userId;
//		this.movieId = movieId;
//		this.screenId = screenId;
//		this.showId = showId;
//		this.theatreId = theatreId;
//	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	public int getNoOfTicketsWantToBook() {
		return noOfTicketsWantToBook;
	}

	public void setNoOfTicketsWantToBook(int noOfTicketsWantToBook) {
		this.noOfTicketsWantToBook = noOfTicketsWantToBook;
	}

}
