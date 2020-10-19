package com.mindtree.search_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReviewDto {

	private long reviewId;
	private String reviwer;
	private String details;
	private double rating;
	@JsonIgnore
	private MovieDto movieDto;

	public ReviewDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewDto(long reviewId, String reviwer, String details, double rating, MovieDto movieDto) {
		super();
		this.reviewId = reviewId;
		this.reviwer = reviwer;
		this.details = details;
		this.rating = rating;
		this.movieDto = movieDto;
	}

	public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviwer() {
		return reviwer;
	}

	public void setReviwer(String reviwer) {
		this.reviwer = reviwer;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public MovieDto getMovieDto() {
		return movieDto;
	}

	public void setMovieDto(MovieDto movieDto) {
		this.movieDto = movieDto;
	}

}
