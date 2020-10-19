package com.mindtree.inventoryservcie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restrictions")
public class Restrictions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restrictionsId;
	private String foodAllowed;
	private int noOfBagsAllowed;
	public Restrictions() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Restrictions(long id, String foodAllowed, int noOfBagsAllowed) {
//		super();
//		this.restrictionsId = id;
//		this.foodAllowed = foodAllowed;
//		this.noOfBagsAllowed = noOfBagsAllowed;
//	}
	public long getId() {
		return restrictionsId;
	}
	public void setId(long id) {
		this.restrictionsId = id;
	}
	public String getFoodAllowed() {
		return foodAllowed;
	}
	public void setFoodAllowed(String foodAllowed) {
		this.foodAllowed = foodAllowed;
	}
	public int getNoOfBagsAllowed() {
		return noOfBagsAllowed;
	}
	public void setNoOfBagsAllowed(int noOfBagsAllowed) {
		this.noOfBagsAllowed = noOfBagsAllowed;
	}
	

}
