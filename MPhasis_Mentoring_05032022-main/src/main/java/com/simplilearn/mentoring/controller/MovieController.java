package com.simplilearn.mentoring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.mentoring.entity.Movie;
import com.simplilearn.mentoring.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies")
	private List<Movie> getAllMovies() {
		
		return movieService.getAllMovies();
	}
	
	@GetMapping("/movies/director/{directorName}")
	private List<String> getAllMoviesByDirectorName(@PathVariable("directorName") String directorName) {
		List<Movie> movies =  movieService.getAllMoviesByDirectorName(directorName);
		
		List<String> movieNames = new ArrayList<>();
		movies.forEach(movie -> movieNames.add(movie.getName()));
		
		return movieNames;
		
		
	}
	
	@PostMapping("/movies")
	private int saveMovie(@RequestBody Movie movie) {
		movieService.saveMovie(movie);
		return movie.getId();
	}
	@DeleteMapping("/movies/{id}")
	private void deleteMovie(@PathVariable("id") int id) {
		movieService.deleteMovie(id);
	}
	
	
}
