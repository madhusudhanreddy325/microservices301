package com.mindtree.search_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.search_service.dto.MovieDto;
import com.mindtree.search_service.dto.ShowDataDto;
import com.mindtree.search_service.dto.TheatreDto;
import com.mindtree.search_service.service.SearchService;

@RestController
public class SearchServiceController {

	@Autowired
	private SearchService searchService;

	@GetMapping("/AllMovies")
	public List<MovieDto> getAllMovieInformation() {
		return searchService.getAllMoviesFromDataBase();
	}

	@GetMapping("/MovieList/{location}/{language}/{genre}")
	public List<MovieDto> getAllMoviesByUserPreference(@PathVariable String location, @PathVariable String language,
			@PathVariable String genre) {
		return searchService.getAllMoviesBasedOnUserPreference(location, language, genre);
	}

	@GetMapping("/ShowDetails/{movieId}")
	public List<ShowDataDto> getTheatresInfoByMovie(@PathVariable String movieId) {
		return searchService.getAllShowsForParticularMovie(movieId);
	}

	@GetMapping("/AllTheatres")
	public List<TheatreDto> getAllTheatresInformation() {
		return searchService.getAllTheatresFromDatabase();
	}
}