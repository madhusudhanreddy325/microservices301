package com.mindtree.inventoryservcie.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")

public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reviewId;
	private String reviwer;
	private String details;
	private double rating;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Movie movie;

//	public Review(long reviewId, String reviwer, String details, Movie movie) {
//		super();
//		this.reviewId = reviewId;
//		this.reviwer = reviwer;
//		this.details = details;
//		this.movie = movie;
//	}
//
//	public Review(long reviewId, String reviwer, String details, double rating, Movie movie) {
//		super();
//		this.reviewId = reviewId;
//		this.reviwer = reviwer;
//		this.details = details;
//		this.rating = rating;
//		this.movie = movie;
//	}

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
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

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
