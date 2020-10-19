package com.mindtree.search_service.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mindtree.search_service.dto.MovieDto;
import com.mindtree.search_service.dto.ShowDataDto;
import com.mindtree.search_service.dto.TheatreDto;

@FeignClient(name = "inventoryservice")
public interface InventoryService {
	@GetMapping("/MovieList")
	public List<MovieDto> getAllMoviesFromDatabase();

	@GetMapping("/getMovieList/{location}/{language}/{genre}")
	public List<MovieDto> getMovieDataByUserPreferences(@PathVariable String location, @PathVariable String language,
			@PathVariable String genre);

	@GetMapping("/ShowData/{movieId}")
	public List<ShowDataDto> getAllShowsByMovieName(@PathVariable String movieId);

	@GetMapping("/TheaterData")
	public List<TheatreDto> getAllTheatresFromDatabase();
}
