package com.mindtree.inventoryservcie.dto;

public class AddressDto {
	private String addId;
	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String state;
	private String pin;
	private double latitude;
	private double longitude;
	private TheatreDto theatreDto;

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public AddressDto(String addId, String line1, String line2, String line3, String city, String state, String pin,
//			double latitude, double longitude, TheatreDto theatreDto) {
//		super();
//		this.addId = addId;
//		this.line1 = line1;
//		this.line2 = line2;
//		this.line3 = line3;
//		this.city = city;
//		this.state = state;
//		this.pin = pin;
//		this.latitude = latitude;
//		this.longitude = longitude;
//		this.theatreDto = theatreDto;
//	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public TheatreDto getTheatreDto() {
		return theatreDto;
	}

	public void setTheatreDto(TheatreDto theatreDto) {
		this.theatreDto = theatreDto;
	}

}
