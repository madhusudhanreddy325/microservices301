package com.mindtree.search_service.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MovieDto {
	private String movieId;
	private String movieName;
	private String actors;
	private String plot;
	private String language;
	private String genre;
	private int rating;
	private byte poster;
	@JsonIgnore
	private List<ShowDataDto> showDataDtos;
	@JsonIgnore
	private List<ReviewDto> reviewDtos;
	@JsonIgnore
	private List<SocialMediaDto> socialMediaDtos;
	private ScreenDto screenDto;

	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieDto(String movieId, String movieName, String actors, String plot, String language, String genre,
			int rating, byte poster, List<ShowDataDto> showDataDtos, List<ReviewDto> reviewDtos,
			List<SocialMediaDto> socialMediaDtos) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actors = actors;
		this.plot = plot;
		this.language = language;
		this.genre = genre;
		this.rating = rating;
		this.poster = poster;
		this.showDataDtos = showDataDtos;
		this.reviewDtos = reviewDtos;
		this.socialMediaDtos = socialMediaDtos;
	}

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

	public List<ShowDataDto> getShowDataDtos() {
		return showDataDtos;
	}

	public void setShowDataDtos(List<ShowDataDto> showDataDtos) {
		this.showDataDtos = showDataDtos;
	}

	public List<ReviewDto> getReviewDtos() {
		return reviewDtos;
	}

	public void setReviewDtos(List<ReviewDto> reviewDtos) {
		this.reviewDtos = reviewDtos;
	}

	public List<SocialMediaDto> getSocialMediaDtos() {
		return socialMediaDtos;
	}

	public void setSocialMediaDtos(List<SocialMediaDto> socialMediaDtos) {
		this.socialMediaDtos = socialMediaDtos;
	}

	public ScreenDto getScreenDto() {
		return screenDto;
	}

	public void setScreenDto(ScreenDto screenDto) {
		this.screenDto = screenDto;
	}

}
