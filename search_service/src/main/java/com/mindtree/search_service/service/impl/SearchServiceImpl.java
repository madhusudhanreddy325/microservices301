package com.mindtree.search_service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.search_service.dto.MovieDto;
import com.mindtree.search_service.dto.ShowDataDto;
import com.mindtree.search_service.dto.TheatreDto;
import com.mindtree.search_service.service.InventoryService;
import com.mindtree.search_service.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private InventoryService inventoryService;

	@Override
	public List<MovieDto> getAllMoviesFromDataBase() {
		return inventoryService.getAllMoviesFromDatabase();
	}

	@Override
	public List<MovieDto> getAllMoviesBasedOnUserPreference(String location, String language, String genre) {
		// TODO Auto-generated method stub
		return inventoryService.getMovieDataByUserPreferences(location, language, genre);
	}

	
	@Override
	public List<TheatreDto> getAllTheatresFromDatabase() {
		// TODO Auto-generated method stub
		return inventoryService.getAllTheatresFromDatabase();
	}

	@Override
	public List<ShowDataDto> getAllShowsForParticularMovie(String movieId) {
		// TODO Auto-generated method stub
		return inventoryService.getAllShowsByMovieName(movieId);
	}

}
