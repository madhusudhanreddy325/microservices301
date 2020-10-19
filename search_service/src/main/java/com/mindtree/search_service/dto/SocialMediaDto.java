package com.mindtree.search_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SocialMediaDto {
	private int socialMediaId;
	private String facebook;
	private String instagram;
	private String twitter;
	private String imdb;
	@JsonIgnore
	private MovieDto movieDto;

	public SocialMediaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocialMediaDto(int socialMediaId, String facebook, String instagram, String twitter, String imdb,
			MovieDto movieDto) {
		super();
		this.socialMediaId = socialMediaId;
		this.facebook = facebook;
		this.instagram = instagram;
		this.twitter = twitter;
		this.imdb = imdb;
		this.movieDto = movieDto;
	}

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

	public MovieDto getMovieDto() {
		return movieDto;
	}

	public void setMovieDto(MovieDto movieDto) {
		this.movieDto = movieDto;
	}

}
