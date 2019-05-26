package com.rohit.movie.catalog.service.model;

import java.util.List;

public class UserRating {
	List<Rating> rating;

	public UserRating() {
		// TODO Auto-generated constructor stub
	}
	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
}
