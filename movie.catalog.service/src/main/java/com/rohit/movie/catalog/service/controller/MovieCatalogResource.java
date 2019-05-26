package com.rohit.movie.catalog.service.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rohit.movie.catalog.service.model.CatalogItem;
import com.rohit.movie.catalog.service.model.Movie;
import com.rohit.movie.catalog.service.model.Rating;
import com.rohit.movie.catalog.service.model.UserRating;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userID}")
	public List<CatalogItem> getCatalogByUserID(@PathVariable("userID") String userID){
//		get rating from rating web service
		UserRating userRating = restTemplate.getForObject("http://movie-rating-service/rating/users/"+ userID,UserRating.class);
		List<Rating> ratings = userRating.getRating(); 

//		get movies information from movie web service
		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieID(), Movie.class);
			return new CatalogItem(movie.getName(), "Sci fi, Action", rating.getRating());
		}).collect(Collectors.toList());
	}
}
