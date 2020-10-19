package com.mindtree.inventoryservcie.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.mindtree.inventoryservcie.proxy.UserProxy;
import com.mindtree.inventoryservcie.repository.AddressRepository;
import com.mindtree.inventoryservcie.repository.MovieRepository;
import com.mindtree.inventoryservcie.repository.RestrictionsRepository;
import com.mindtree.inventoryservcie.repository.ReviewRepository;
import com.mindtree.inventoryservcie.repository.ScreenRepository;
import com.mindtree.inventoryservcie.repository.ShowDataRepository;
import com.mindtree.inventoryservcie.repository.SocialMediaRepository;
import com.mindtree.inventoryservcie.repository.TheatreRepository;
import com.mindtree.inventoryservcie.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private RestrictionsRepository restrictionsRepository;

	@Autowired
	private ReviewRepository reviewRepository;

	@Autowired
	private ScreenRepository screenRepository;

	@Autowired
	private ShowDataRepository showRepository;

	@Autowired
	private SocialMediaRepository socialMediaRepository;

	@Autowired
	private TheatreRepository theatreRepository;

	@Autowired
	private UserProxy userProxy;

	@Override
	public Object addRestrictionsToTheatre(Restrictions restrictions, String userId) {

		String message = null;
		if (userProxy.checkUserRole(userId)) {
			restrictionsRepository.save(restrictions);
			message = "restrictions added succussfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addRestrictionstoParticularTheatre(String theatreId, Long restrictionsId, String userId) {

		String message = null;
		Restrictions restrictions = restrictionsRepository.getOne(restrictionsId);
		Theatre theatre = theatreRepository.getOne(theatreId);
		if (userProxy.checkUserRole(userId)) {

			theatre.setRestrictions(restrictions);
			theatreRepository.save(theatre);
			message = "restrictions set to theatre done succesfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addAddressToDatabaseAndParticularTheatre(Address address, String theatreId, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			Theatre theatre = theatreRepository.getOne(theatreId);
			address.setTheatre(theatre);
			addressRepository.save(address);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addMovieDataToDatabase(Movie movie, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			movieRepository.save(movie);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addScreenDataToDataBase(Screen screen, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			screenRepository.save(screen);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addShowDataToDataBase(ShowData showData, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			showRepository.save(showData);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addShowDataToParticularScreen(String showId, String screenId, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			Screen screen = screenRepository.getOne(screenId);
			ShowData showData = showRepository.getOne(showId);
			showData.setScreen(screen);
			showRepository.save(showData);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addShowAndScreenDataToParticularMovie(String movieId, String showId, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			ShowData showData = showRepository.getOne(showId);
			Movie movie = movieRepository.getOne(movieId);
			showData.setMovie(movie);
			movieRepository.save(movie);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addParticularTheatreToParticularScreen(String screenId, String theatreId, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			Theatre theatre = theatreRepository.getOne(theatreId);
			Screen screen = screenRepository.getOne(screenId);
			screen.setTheatre(theatre);
			screenRepository.save(screen);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public Object addReviewsToParticularMovie(Review review, String movieId) {

		Movie movie = movieRepository.getOne(movieId);
		review.setMovie(movie);
		reviewRepository.save(review);
		return "Done";
	}

	@Override
	public Object addSocialMediaLinksToMovieData(SocialMedia socialMedia, String movieId, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			Movie movie = movieRepository.getOne(movieId);
			socialMedia.setMovie(movie);
			socialMediaRepository.save(socialMedia);
			message = "added successfully";
		} else {
			message = "not an admin";
		}
		return message;
	}

	@Override
	public List<MovieDto> findAllMovies() {
		List<MovieDto> movies = new ArrayList<MovieDto>();
		for (Movie movie : movieRepository.findAll()) {
			MovieDto movieDto = modelMapper.map(movie, MovieDto.class);
			movies.add(movieDto);

		}
		return movies;
	}

	@Override
	public List<TheatreDto> findAllTheatres() {
		List<TheatreDto> theatres = new ArrayList<TheatreDto>();
		for (Theatre theatre : theatreRepository.findAll()) {
			TheatreDto theatreDto = modelMapper.map(theatre, TheatreDto.class);
			theatres.add(theatreDto);
		}
		return theatres;

	}

	@Override
	public List<MovieDto> getMovieResultsByUserPreferences(String location, String language, String genre) {

		List<MovieDto> movies = new ArrayList<MovieDto>();
		for (Movie movie : movieRepository.findAll()) {
			if (language.equalsIgnoreCase(movie.getLanguage())) {
				if (genre.equalsIgnoreCase(movie.getGenre())) {
					for (Theatre theatre : theatreRepository.findAll()) {
						if (theatre.getLocation().equalsIgnoreCase(location)) {

							MovieDto movieDto = modelMapper.map(movie, MovieDto.class);
							movies.add(movieDto);
						}
					}
				}
			}
		}
		// System.out.println(movies);
		return movies;
	}

	@Override
	public String addTheatreToDataBase(Theatre theatre, String userId) {
		String message = null;
		if (userProxy.checkUserRole(userId)) {
			theatreRepository.save(theatre);
			message = "theatre added succussfully";
		} else {
			message = "theatre not added succussfully";
		}
		return message;
//		theatreRepository.save(theatre);
		// return "added";
	}

	@Override
	public List<ShowDataDto> getAllShowsForParticularMovie(String movieId) {
		List<ShowDataDto> showDataDtos = new ArrayList<ShowDataDto>();
		for (Movie movie : movieRepository.findAll()) {
			if (movieId.equalsIgnoreCase(movie.getMovieId())) {
				for (ShowData showData : movie.getShowData()) {
					ShowDataDto showDataDto = modelMapper.map(showData, ShowDataDto.class);
					showDataDtos.add(showDataDto);
				}
			}
		}
		return showDataDtos;
	}

	@Override
	public ShowDataDto getShowDetailsForParticularShow(String showId) {
		Optional<ShowData> showData = showRepository.findById(showId);
		ShowDataDto showDataDto = modelMapper.map(showData, ShowDataDto.class);
		// showIdd = showDataDto.getShowId();
		return showDataDto;
	}

	@Override
	public Boolean sendBookingDetails(BookingDto bookingDto) {
		Boolean b;
		String showIdd = bookingDto.getShowId();
		ShowData showData = showRepository.getOne(showIdd);
		int seatsAvailable = showData.getTotalFreeSeats();
		if (bookingDto.getNoOfTicketsWantToBook() > seatsAvailable) {
			b = false;
		} else {
			showData.setTotalFreeSeats(seatsAvailable - bookingDto.getNoOfTicketsWantToBook());
			showRepository.save(showData);
			b = true;
		}
		return b;
	}

}