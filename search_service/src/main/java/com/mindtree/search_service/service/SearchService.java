package com.mindtree.search_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.search_service.dto.MovieDto;
import com.mindtree.search_service.dto.ShowDataDto;
import com.mindtree.search_service.dto.TheatreDto;

@Service
public interface SearchService {

	List<MovieDto> getAllMoviesFromDataBase();

	List<MovieDto> getAllMoviesBasedOnUserPreference(String location, String language, String genre);

	List<ShowDataDto> getAllShowsForParticularMovie(String movieId);

	List<TheatreDto> getAllTheatresFromDatabase();
}
