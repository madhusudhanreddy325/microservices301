package com.mindtree.inventoryservcie.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TheatreDto {

	private String theatreId;
	private String name;
	private String parkingFacilityAvailable;
	private int noOfScreens;
	private String location;
	@JsonIgnore
	private List<ScreenDto> screenDtos;
	private RestrictionsDto restrictionsDto;

	public TheatreDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public TheatreDto(String theatreId, String name, String parkingFacilityAvailable, int noOfScreens, String location,
//			List<ScreenDto> screenDtos, RestrictionsDto restrictionsDto) {
//		super();
//		this.theatreId = theatreId;
//		this.name = name;
//		this.parkingFacilityAvailable = parkingFacilityAvailable;
//		this.noOfScreens = noOfScreens;
//		this.location = location;
//		this.screenDtos = screenDtos;
//		this.restrictionsDto = restrictionsDto;
//	}

	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParkingFacilityAvailable() {
		return parkingFacilityAvailable;
	}

	public void setParkingFacilityAvailable(String parkingFacilityAvailable) {
		this.parkingFacilityAvailable = parkingFacilityAvailable;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<ScreenDto> getScreenDtos() {
		return screenDtos;
	}

	public void setScreenDtos(List<ScreenDto> screenDtos) {
		this.screenDtos = screenDtos;
	}

	public RestrictionsDto getRestrictionsDto() {
		return restrictionsDto;
	}

	public void setRestrictionsDto(RestrictionsDto restrictionsDto) {
		this.restrictionsDto = restrictionsDto;
	}

}
