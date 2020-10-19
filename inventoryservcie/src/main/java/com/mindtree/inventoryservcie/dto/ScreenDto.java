package com.mindtree.inventoryservcie.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ScreenDto {

	private String screenId;
	private String name;
	private String type;
	private int totalNoOfSeats;
	private int totalFreeSeats;
	private int totalDamagedSeats;
	private int numberOfRows;
	@JsonIgnore
	private List<ShowDataDto> showDataDtos;
	@JsonIgnore
	private TheatreDto theatreDto;

	public ScreenDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public ScreenDto(String screenId, String name, String type, int totalNoOfSeats, int totalFreeSeats,
//			int totalDamagedSeats, int numberOfRows, List<ShowDataDto> showDataDtos, TheatreDto theatreDto) {
//		super();
//		this.screenId = screenId;
//		this.name = name;
//		this.type = type;
//		this.totalNoOfSeats = totalNoOfSeats;
//		this.totalFreeSeats = totalFreeSeats;
//		this.totalDamagedSeats = totalDamagedSeats;
//		this.numberOfRows = numberOfRows;
//		this.showDataDtos = showDataDtos;
//		this.theatreDto = theatreDto;
//	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public List<ShowDataDto> getShowDataDtos() {
		return showDataDtos;
	}

	public void setShowDataDtos(List<ShowDataDto> showDataDtos) {
		this.showDataDtos = showDataDtos;
	}

	public TheatreDto getTheatreDto() {
		return theatreDto;
	}

	public void setTheatreDto(TheatreDto theatreDto) {
		this.theatreDto = theatreDto;
	}

}
