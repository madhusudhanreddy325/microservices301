package com.mindtree.search_service.dto;

public class RestrictionsDto {
	private long restrictionsId;
	private String foodAllowed;
	private int noOfBagsAllowed;

	public RestrictionsDto(long restrictionsId, String foodAllowed, int noOfBagsAllowed) {
		super();
		this.restrictionsId = restrictionsId;
		this.foodAllowed = foodAllowed;
		this.noOfBagsAllowed = noOfBagsAllowed;
	}

	public RestrictionsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getRestrictionsId() {
		return restrictionsId;
	}

	public void setRestrictionsId(long restrictionsId) {
		this.restrictionsId = restrictionsId;
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
