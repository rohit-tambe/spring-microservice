package com.rohit.movie.info.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.movie.info.service.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoServiceController {
	
	
	@RequestMapping("/{movieID}")
	public Movie getMovieInfo(@PathVariable("movieID")  String movieID){
		return new Movie("1", "Avangers");
	}
}
