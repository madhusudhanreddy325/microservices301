package com.mindtree.inventoryservcie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "screen")

public class Screen {

	@Id
	private String screenId;
	private String name;
	private String type;
	private int totalNoOfSeats;
	private int totalFreeSeats;
	private int totalDamagedSeats;
	private int numberOfRows;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "screen")
	private List<ShowData> shows;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Theatre theatre;

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Screen(String id, String name, String type, int totalNoOfSeats, int totalFreeSeats, int totalDamagedSeats,
//			int numberOfRows, List<ShowData> shows, Theatre theatre) {
//		super();
//		this.screenId = id;
//		this.name = name;
//		this.type = type;
//		this.totalNoOfSeats = totalNoOfSeats;
//		this.totalFreeSeats = totalFreeSeats;
//		this.totalDamagedSeats = totalDamagedSeats;
//		this.numberOfRows = numberOfRows;
//		this.shows = shows;
//		this.theatre = theatre;
//	}

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

	public List<ShowData> getShows() {
		return shows;
	}

	public void setShows(List<ShowData> shows) {
		this.shows = shows;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

}
