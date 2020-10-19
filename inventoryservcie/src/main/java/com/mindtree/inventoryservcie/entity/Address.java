package com.mindtree.inventoryservcie.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	private String addId;
	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String state;
	private String pin;
	private double latitude;
	private double longitude;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "tId")
	private Theatre theatre;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Address(String addId, String line1, String line2, String line3, String city, String state, String pin,
//			double latitude, double longitude, Theatre theatre) {
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
//		this.theatre = theatre;
//	}

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

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

}
