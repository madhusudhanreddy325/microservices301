package com.mindtree.inventoryservcie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.inventoryservcie.service.InventoryService;
import com.mindtree.inventoryservcie.dto.BookingDto;
import com.mindtree.inventoryservcie.dto.MovieDto;
import com.mindtree.inventoryservcie.dto.ShowDataDto;
import com.mindtree.inventoryservcie.dto.TheatreDto;
import com.mindtree.inventoryservcie.entity.Address;
import com.mindtree.inventoryservcie.entity.Movie;
import com.mindtree.inventoryservcie.entity.Restrictions;
import com.mindtree.inventoryservcie.entity.Review;
import com.mindtree.inventoryservcie.entity.Screen;
import com.mindtree.inventoryservcie.entity.ShowData;
import com.mindtree.inventoryservcie.entity.SocialMedia;
import com.mindtree.inventoryservcie.entity.Theatre;

@RestController
public class InventoryServiceController {

	@Autowired
	private InventoryService inventoryService;

	@RequestMapping("/addTheatre/{userId}")
	public String addTheatre(@RequestBody Theatre theatre, @PathVariable String userId) {

		inventoryService.addTheatreToDataBase(theatre, userId);
		return "theatre added succussfully";

	}

	@PostMapping("/addRestrictions/{userId}")
	public String addRestrictions(@RequestBody Restrictions restrictions, @PathVariable String userId) {
		inventoryService.addRestrictionsToTheatre(restrictions, userId);

		return "Restrictions added successfully";
	}

	@PutMapping("/setRestrictionsToTheatre/{theatreId}/{restrictionsId}/{userId}")
	public String setRestrictionsToTheatre(@PathVariable String theatreId, @PathVariable long restrictionsId,
			@PathVariable String userId) {
		inventoryService.addRestrictionstoParticularTheatre(theatreId, restrictionsId, userId);

		return "Restrictions added to theatre successfully";

	}

	@PostMapping("/addAddress/{theatreId}/{userId}")
	public String addAddressToParticularTheatre(@RequestBody Address address, @PathVariable String theatreId,
			@PathVariable String userId) {
		inventoryService.addAddressToDatabaseAndParticularTheatre(address, theatreId, userId);

		return "Address added successfully";
	}

	@PostMapping("/addMovie/{userId}")
	public String addMovieToDatabase(@RequestBody Movie movie, @PathVariable String userId) {
		inventoryService.addMovieDataToDatabase(movie, userId);
		return "Movie added successfully";
	}

	@PostMapping("/addScreen/{userId}")
	public String addScreenToDatabase(@RequestBody Screen screen, @PathVariable String userId) {

		inventoryService.addScreenDataToDataBase(screen, userId);
		return "Screen added successfully";
	}

	@PostMapping("/addShowData/{userId}")
	public String addShowDataToDatabase(@RequestBody ShowData showData, @PathVariable String userId) {
		inventoryService.addShowDataToDataBase(showData, userId);
		return "Show Data added successfully";

	}

	@PutMapping("/setShowToScreen/{showId}/{screenId}/{userId}")
	public String setScreenToParticularShow(@PathVariable String showId, @PathVariable String screenId,
			@PathVariable String userId) {
		inventoryService.addShowDataToParticularScreen(showId, screenId, userId);
		return "Screen added to Show successfully";
	}

	@PutMapping("/setShowAndScreenToTheatre/{movieId}/{showId}/{userId}")
	public String setScreenAndShowToParticularMovie(@PathVariable String movieId, @PathVariable String showId,
			@PathVariable String userId) {
		inventoryService.addShowAndScreenDataToParticularMovie(movieId, showId, userId);
		return "Screen and show added to Movie successfully";
	}

	@PutMapping("/setTheatreToScreen/{screenId}/{theatreId}/{userId}")
	public String setScreenToParticularTheatre(@PathVariable String screenId, @PathVariable String theatreId,
			@PathVariable String userId) {
		inventoryService.addParticularTheatreToParticularScreen(screenId, theatreId, userId);
		return "Screen added to Theatre successfully";
	}

	@PostMapping("/addReviewsToMovie/{movieId}")
	public String addReviewToParticularMovie(@RequestBody Review review, @PathVariable String movieId) {
		inventoryService.addReviewsToParticularMovie(review, movieId);
		return "REviews added successfully";
	}

	@PostMapping("/addSocialMediaToMovie/{movieId}/{userId}")
	public String addSocialMediaToParticularMovie(@RequestBody SocialMedia socialMedia, @PathVariable String movieId,
			@PathVariable String userId) {
		inventoryService.addSocialMediaLinksToMovieData(socialMedia, movieId, userId);
		return "Social Media Data added successfully";

	}

	@GetMapping("/MovieList")
	public List<MovieDto> getAllMoviesFromDatabase() {
		return inventoryService.findAllMovies();
	}

	@GetMapping("/TheaterData")
	public List<TheatreDto> getAllTheatresFromDatabase() {
		return inventoryService.findAllTheatres();
	}

	@GetMapping("/getMovieList/{location}/{language}/{genre}")
	public List<MovieDto> getMovieDataByUserPreferences(@PathVariable String location, @PathVariable String language,
			@PathVariable String genre) {
		return inventoryService.getMovieResultsByUserPreferences(location, language, genre);
	}

	@GetMapping("/ShowData/{movieId}")
	public List<ShowDataDto> getAllShowsByMovieName(@PathVariable String movieId) {
		return inventoryService.getAllShowsForParticularMovie(movieId);
	}

	@GetMapping("/ShowDetails/{showId}")
	public ShowDataDto getShowInfo(@PathVariable String showId) {
		return inventoryService.getShowDetailsForParticularShow(showId);
	}

	@RequestMapping("/checkAvailablity")
	public Boolean sendBookingDetails(@RequestBody BookingDto bookingDto) {
		return inventoryService.sendBookingDetails(bookingDto);
	}
}
