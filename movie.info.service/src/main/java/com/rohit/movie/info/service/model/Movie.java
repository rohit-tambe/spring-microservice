package com.rohit.movie.info.service.model;


public class Movie {
	private String movieID;
	private String name;
	public Movie(String movieID, String name) {
		super();
		this.movieID = movieID;
		this.name = name;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
