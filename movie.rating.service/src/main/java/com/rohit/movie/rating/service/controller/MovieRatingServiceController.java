package com.rohit.movie.rating.service.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.movie.rating.service.model.Rating;
import com.rohit.movie.rating.service.model.UserRating;

@RestController
@RequestMapping("/rating")
public class MovieRatingServiceController {
	
	@RequestMapping("/{movieID}")
	public Rating getRating( @PathVariable("movieID") String movieID){
		return new Rating(movieID, 4);
	}
	@RequestMapping("users/{userID}")
	public UserRating getRatingByUserID( @PathVariable("userID") String userID){
		List<Rating> rating =   Arrays.asList( new Rating("1234", 4),
				new Rating("5678", 3)
				);
		UserRating userRating = new UserRating();
		userRating.setRating(rating);
		return userRating;
	}
}
