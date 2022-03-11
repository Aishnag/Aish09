package com.simplilearn.mentoring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.mentoring.entity.Director;
import com.simplilearn.mentoring.entity.Movie;
import com.simplilearn.mentoring.reository.DirectorRepository;
import com.simplilearn.mentoring.reository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	DirectorRepository directorRepository;
	
	
	public List<Movie> getAllMovies() {
		
		List<Movie> movies = new ArrayList<>();
		
		movieRepository.findAll().forEach(movie -> movies.add(movie));
		
		return movies;
	}
	
public List<Movie> getAllMoviesByDirectorName(String directorName) {
		
		List<Movie> movies = new ArrayList<>();
		
		movieRepository.findByDirectorName(directorName).forEach(movie -> movies.add(movie));
		
		return movies;
	}
	
	public void saveMovie(Movie movie) {
		
		String directorName = movie.getDirector().getDirectorName();
		
		Optional<Director> optDirector = directorRepository.findByDirectorName(directorName);
		
		if(optDirector.isPresent()) {
			movie.setDirector(optDirector.get());
		}
		
		movieRepository.save(movie);
	}
	
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}

}
