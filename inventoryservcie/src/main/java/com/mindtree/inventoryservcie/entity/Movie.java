package com.mindtree.inventoryservcie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	private String movieId;
	private String movieName;
	private String actors;
	private String plot;
	private String language;
	private String genre;
	private int rating;
	private byte poster;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "movie")
	private List<ShowData> showData;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "movie")
	private List<SocialMedia> socialMedias;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "movie")
	private List<Review> reviews;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Movie(String movieId, String movieName, String actors, String plot, String language, String genre,
//			int rating, byte poster, List<ShowData> shows, List<SocialMedia> socialMedias, List<Review> reviews) {
//		super();
//		this.movieId = movieId;
//		this.movieName = movieName;
//		this.actors = actors;
//		this.plot = plot;
//		this.language = language;
//		this.genre = genre;
//		this.rating = rating;
//		this.poster = poster;
//		this.showData = shows;
//		this.socialMedias = socialMedias;
//		this.reviews = reviews;
//
//	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public byte getPoster() {
		return poster;
	}

	public void setPoster(byte poster) {
		this.poster = poster;
	}

	public List<ShowData> getShowData() {
		return showData;
	}

	public void setShowData(List<ShowData> showData) {
		this.showData = showData;
	}

	public List<SocialMedia> getSocialMedias() {
		return socialMedias;
	}

	public void setSocialMedias(List<SocialMedia> socialMedias) {
		this.socialMedias = socialMedias;
	}

	public List<SocialMedia> getEvents() {
		return socialMedias;
	}

	public void setEvents(List<SocialMedia> events) {
		this.socialMedias = events;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
