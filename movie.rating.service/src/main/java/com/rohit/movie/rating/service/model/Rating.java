package com.rohit.movie.rating.service.model;

public class Rating {
	private String movieID;
	private int rating;
	
	
	public Rating(String movieID, int rating) {
		super();
		this.movieID = movieID;
		this.rating = rating;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
