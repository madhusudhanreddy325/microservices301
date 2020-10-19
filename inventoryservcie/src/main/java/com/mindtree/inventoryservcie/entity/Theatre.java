package com.mindtree.inventoryservcie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="theatre")
public class Theatre {

	@Id
	private String theatreId;
	private String name;
	private String parkingFacilityAvailable;
	private int noOfScreens;
	private String location;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "theatre")
	private List<Screen> screens;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "restrictionsId")
	private Restrictions restrictions;
//	public Theatre(String theatreId, String name, String parkingFacilityAvailable, int noOfScreens,
//			String location, List<Screen> screens, Restrictions restrictions) {
//		super();
//		this.theatreId = theatreId;
//		this.name = name;
//		this.parkingFacilityAvailable = parkingFacilityAvailable;
//		this.noOfScreens = noOfScreens;
//		this.location = location;
//		this.screens = screens;
//		this.restrictions = restrictions;
//	}
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	public Restrictions getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(Restrictions restrictions) {
		this.restrictions = restrictions;
	}
}
