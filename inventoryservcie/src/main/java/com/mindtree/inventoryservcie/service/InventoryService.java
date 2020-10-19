package com.mindtree.inventoryservcie.service;

import java.util.List;

import org.springframework.stereotype.Service;

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

@Service
public interface InventoryService {

	String addTheatreToDataBase(Theatre theatre, String userId);

	Object addRestrictionsToTheatre(Restrictions restrictions, String userId);

	Object addRestrictionstoParticularTheatre(String theatreId, Long restrictionsId, String userId);

	Object addAddressToDatabaseAndParticularTheatre(Address address, String theatreId, String userId);

	Object addMovieDataToDatabase(Movie movie, String userId);

	Object addScreenDataToDataBase(Screen screen, String userId);

	Object addShowDataToDataBase(ShowData showData, String userId);

	Object addShowDataToParticularScreen(String showId, String screenId, String userId);

	Object addShowAndScreenDataToParticularMovie(String movieId, String showId, String userId);

	Object addParticularTheatreToParticularScreen(String screenId, String theatreId, String userId);

	Object addReviewsToParticularMovie(Review review, String movieId);

	Object addSocialMediaLinksToMovieData(SocialMedia socialMedia, String movieId, String userId);

	List<MovieDto> findAllMovies();

	List<TheatreDto> findAllTheatres();

	List<MovieDto> getMovieResultsByUserPreferences(String location, String language, String genre);

	List<ShowDataDto> getAllShowsForParticularMovie(String movieId);

	ShowDataDto getShowDetailsForParticularShow(String showId);

	Boolean sendBookingDetails(BookingDto bookingDto);
}
