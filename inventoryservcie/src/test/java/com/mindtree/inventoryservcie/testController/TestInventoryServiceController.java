/**
 * 
 */
package com.mindtree.inventoryservcie.testController;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mindtree.inventoryservcie.controller.InventoryServiceController;
import com.mindtree.inventoryservcie.dto.MovieDto;
import com.mindtree.inventoryservcie.dto.TheatreDto;
import com.mindtree.inventoryservcie.entity.Address;
import com.mindtree.inventoryservcie.entity.Movie;
import com.mindtree.inventoryservcie.entity.Restrictions;
import com.mindtree.inventoryservcie.entity.Review;
import com.mindtree.inventoryservcie.entity.Screen;
import com.mindtree.inventoryservcie.entity.ShowData;
import com.mindtree.inventoryservcie.entity.SocialMedia;
import com.mindtree.inventoryservcie.entity.Theatre;
import com.mindtree.inventoryservcie.service.impl.InventoryServiceImpl;

/**
 * @author Madhu Sudhan
 *
 */
@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(InventoryServiceController.class)
@AutoConfigureDataJpa
public class TestInventoryServiceController {

	@InjectMocks
	private InventoryServiceController inventoryServiceController;

	@Mock
	private InventoryServiceImpl inventoryServiceImpl;
	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(inventoryServiceController).build();
	}

	@Test
	public void testAddTheatre() {
		String userId = "123";
		Theatre theatre = new Theatre();
		theatre.setLocation("location");
		theatre.setName("name");
		theatre.setNoOfScreens(1);
		theatre.setParkingFacilityAvailable("parkingFacilityAvailable");
		theatre.setTheatreId("theatreId");
		// when(inventoryServiceImpl.addTheatreToDataBase(theatre,
		// userId)).thenReturn("theatre added succussfully");
		assertEquals(inventoryServiceController.addTheatre(theatre, userId), "theatre added succussfully");
	}

	@Test
	public void testAddRestrictions() {
		Restrictions restrictions = new Restrictions();
		restrictions.setFoodAllowed("foodAllowed");
		restrictions.setId(1);
		restrictions.setNoOfBagsAllowed(2);
		String userId = "123";
		assertEquals(inventoryServiceController.addRestrictions(restrictions, userId),
				"Restrictions added successfully");
	}

	@Test
	public void testSetRestrictionsToTheatre() {
		Restrictions restrictions = new Restrictions();
		Theatre theatre = new Theatre();
		String theatreId = "111";
		long restrictionsId = 1;
		String userId = "123";
		theatre.setRestrictions(restrictions);
		assertEquals(inventoryServiceController.setRestrictionsToTheatre(theatreId, restrictionsId, userId),
				"Restrictions added to theatre successfully");
	}

	@Test
	public void testAddAddressToParticularTheatre() {
		Address address = new Address();
		address.setAddId("addId");
		address.setCity("city");
		address.setLatitude(11);
		address.setLine1("line1");
		address.setLine2("line2");
		address.setLine3("line3");
		address.setLongitude(11);
		address.setPin("1234");
		address.setState("state");
		Theatre theatre = new Theatre();
		String theatreId = "111";
		String userId = "123";
		address.setTheatre(theatre);
		assertEquals(inventoryServiceController.addAddressToParticularTheatre(address, theatreId, userId),
				"Address added successfully");
	}

	@Test
	public void testAddMovieToDatabase() {
		Movie movie = new Movie();
		String userId = "123";
		movie.setActors("actors");
		movie.setGenre("genre");
		movie.setLanguage("language");
		movie.setMovieId("movieId");
		movie.setMovieName("movieName");
		movie.setPlot("plot");
		movie.setRating(11);
		assertEquals(inventoryServiceController.addMovieToDatabase(movie, userId), "Movie added successfully");
	}

	@Test
	public void testAddScreenToDatabase() {
		Screen screen = new Screen();
		screen.setName("name");
		screen.setNumberOfRows(11);
		screen.setScreenId("screenId");
		screen.setTotalDamagedSeats(1);
		screen.setTotalFreeSeats(111);
		screen.setTotalNoOfSeats(1);
		screen.setType("type");
		String userId = "123";
		assertEquals(inventoryServiceController.addScreenToDatabase(screen, userId), "Screen added successfully");
	}

	@Test
	public void testAddShowDataToDatabase() {
		ShowData showData = new ShowData();
		showData.setDuration("duration");
		showData.setNumberOfRows(11);
		showData.setShowId("showId");
		showData.setTimings("timings");
		showData.setTotalBookedSeats(11);
		showData.setTotalDamagedSeats(2);
		showData.setTotalFreeSeats(1);
		showData.setTotalNoOfSeats(222);
		String userId = "123";
		assertEquals(inventoryServiceController.addShowDataToDatabase(showData, userId),
				"Show Data added successfully");
	}

	@Test
	public void testSetScreenToParticularShow() {
		// ShowData showData = new ShowData();
		// Screen screen = new Screen();
		String screenId = "sc";
		String showId = "111";
		String userId = "123";
		assertEquals(inventoryServiceController.setScreenToParticularShow(showId, screenId, userId),
				"Screen added to Show successfully");
	}

	@Test
	public void testSetScreenAndShowToParticularMovie() {
		String movieId = "sc";
		String showId = "111";
		String userId = "123";
		assertEquals(inventoryServiceController.setScreenAndShowToParticularMovie(movieId, showId, userId),
				"Screen and show added to Movie successfully");
	}

	@Test
	public void testSetScreenToParticularTheatre() {
		// String movieId = "sc";
		String theatreId = "111";
		String userId = "123";
		String screenId = "sc";
		assertEquals(inventoryServiceController.setScreenToParticularTheatre(screenId, theatreId, userId),
				"Screen added to Theatre successfully");
	}

	@Test
	public void testAddReviewToParticularMovie() {
		String movieId = "sc";
		Review review = new Review();
		review.setDetails("details");
		review.setRating(11);
		review.setReviwer("reviwer");
		review.setReviewId(1);
		assertEquals(inventoryServiceController.addReviewToParticularMovie(review, movieId),
				"REviews added successfully");
	}

	@Test
	public void testAddSocialMediaToParticularMovie() {
		String movieId = "sc";
		SocialMedia socialMedia = new SocialMedia();
		socialMedia.setFacebook("facebook");
		socialMedia.setImdb("imdb");
		socialMedia.setInstagram("instagram");
		socialMedia.setTwitter("twitter");
		socialMedia.setSocialMediaId(1);
		String userId = "123";
		assertEquals(inventoryServiceController.addSocialMediaToParticularMovie(socialMedia, movieId, userId),
				"Social Media Data added successfully");
	}

	@Test
	public void testGetAllMoviesFromDatabase() {
		MovieDto movieDto = new MovieDto();
		List<MovieDto> movieDtos = new ArrayList<MovieDto>();
		movieDto.setActors("actors");
		movieDto.setGenre("genre");
		movieDto.setLanguage("language");
		movieDto.setMovieId("movieId");
		movieDto.setMovieName("movieName");
		movieDto.setPlot("plot");
		movieDto.setRating(11);
		movieDtos.add(movieDto);
		assertEquals(inventoryServiceController.getAllMoviesFromDatabase(), inventoryServiceImpl.findAllMovies());
	}

	@Test
	public void testGetAllTheatresFromDatabase() {
		TheatreDto theatreDto = new TheatreDto();
		// Theatre theatreDto = new Theatre();
		theatreDto.setLocation("location");
		theatreDto.setName("name");
		theatreDto.setNoOfScreens(1);
		theatreDto.setParkingFacilityAvailable("parkingFacilityAvailable");
		theatreDto.setTheatreId("theatreId");
		List<TheatreDto> theatreDtos = new ArrayList<TheatreDto>();
		theatreDtos.add(theatreDto);
		assertEquals(inventoryServiceController.getAllTheatresFromDatabase(), inventoryServiceImpl.findAllTheatres());
	}

	@Test
	public void testGetMovieDataByUserPreferences() {
		String location = "location";
		String language = "language";
		String genre = "language";
		assertEquals(inventoryServiceController.getMovieDataByUserPreferences(location, language, genre),
				inventoryServiceImpl.getMovieResultsByUserPreferences(location, language, genre));
	}
}
