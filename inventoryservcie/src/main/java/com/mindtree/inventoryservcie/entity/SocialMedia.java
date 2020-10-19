package com.mindtree.inventoryservcie.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="socialMedia")
public class SocialMedia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int socialMediaId;
	private String facebook;
	private String instagram;
	private String twitter;
	private String imdb;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Movie movie;
	public SocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public SocialMedia(int socialMediaId, String facebook, String instagram, String twitter, String imdb, Movie movie) {
//		super();
//		this.socialMediaId = socialMediaId;
//		this.facebook = facebook;
//		this.instagram = instagram;
//		this.twitter = twitter;
//		this.imdb = imdb;
//		this.movie = movie;
//	}
	public int getSocialMediaId() {
		return socialMediaId;
	}
	public void setSocialMediaId(int socialMediaId) {
		this.socialMediaId = socialMediaId;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getImdb() {
		return imdb;
	}
	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
	
	

}
