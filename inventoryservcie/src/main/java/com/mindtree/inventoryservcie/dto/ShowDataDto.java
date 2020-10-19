package com.mindtree.inventoryservcie.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ShowDataDto {
	private String showId;
	private String timings;
	private String duration;
	private int totalNoOfSeats;
	private int totalFreeSeats;
	private int totalBookedSeats;
	private int totalDamagedSeats;
	private int numberOfRows;
	private ScreenDto screenDto;
	@JsonIgnore
	private MovieDto movieDto;

	public ShowDataDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public ShowDataDto(String showId, String timings, String duration, int totalNoOfSeats, int totalFreeSeats,
//			int totalBookedSeats, int totalDamagedSeats, int numberOfRows, ScreenDto screenDto, MovieDto movieDto) {
//		super();
//		this.showId = showId;
//		this.timings = timings;
//		this.duration = duration;
//		this.totalNoOfSeats = totalNoOfSeats;
//		this.totalFreeSeats = totalFreeSeats;
//		this.totalBookedSeats = totalBookedSeats;
//		this.totalDamagedSeats = totalDamagedSeats;
//		this.numberOfRows = numberOfRows;
//		this.screenDto = screenDto;
//		this.movieDto = movieDto;
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

	public ScreenDto getScreenDto() {
		return screenDto;
	}

	public void setScreenDto(ScreenDto screenDto) {
		this.screenDto = screenDto;
	}

	public MovieDto getMovieDto() {
		return movieDto;
	}

	public void setMovieDto(MovieDto movieDto) {
		this.movieDto = movieDto;
	}

}
