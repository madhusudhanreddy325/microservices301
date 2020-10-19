package com.mindtree.inventoryservcie.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "showData")
public class ShowData {

	@Id
	private String showId;
	private String timings;
	private String duration;
	private int totalNoOfSeats;
	private int totalFreeSeats;
	private int totalBookedSeats;
	private int totalDamagedSeats;
	private int numberOfRows;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Screen screen;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Movie movie;

	public ShowData() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public ShowData(String showId, String timings, String duration, int totalNoOfSeats, int totalFreeSeats,
//			int totalBookedSeats, int totalDamagedSeats, int numberOfRows, Screen screen) {
//		super();
//		this.showId = showId;
//		this.timings = timings;
//		this.duration = duration;
//		this.totalNoOfSeats = totalNoOfSeats;
//		this.totalFreeSeats = totalFreeSeats;
//		this.totalBookedSeats = totalBookedSeats;
//		this.totalDamagedSeats = totalDamagedSeats;
//		this.numberOfRows = numberOfRows;
//		this.screen = screen;
//	}

	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(int totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public int getTotalFreeSeats() {
		return totalFreeSeats;
	}

	public void setTotalFreeSeats(int totalFreeSeats) {
		this.totalFreeSeats = totalFreeSeats;
	}

	public int getTotalBookedSeats() {
		return totalBookedSeats;
	}

	public void setTotalBookedSeats(int totalBookedSeats) {
		this.totalBookedSeats = totalBookedSeats;
	}

	public int getTotalDamagedSeats() {
		return totalDamagedSeats;
	}

	public void setTotalDamagedSeats(int totalDamagedSeats) {
		this.totalDamagedSeats = totalDamagedSeats;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	

}
