package com.simplilearn.mentoring.reository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplilearn.mentoring.entity.Movie;

@Repository
public interface MovieRepository  extends CrudRepository<Movie, Integer> {
	
	public List<Movie> findByName(@Param("movieName") String movieName);
	
	
	//HQL query 
	@Query("select movie from Movie movie left join Director director on movie.director.id = director.id where director.directorName = :directorName ")
	public List<Movie> findByDirectorName(@Param("directorName") String directorName);
}
