package com.rohit.movie.rating.service.model;

import java.util.List;

public class UserRating {
	List<Rating> rating;

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
}
