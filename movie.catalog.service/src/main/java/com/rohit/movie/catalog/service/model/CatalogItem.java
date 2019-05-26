package com.rohit.movie.catalog.service.model;

public class CatalogItem {
	private String name;
	private String desciption;
	private int rating;
	
	public CatalogItem(String name, String desciption, int rating) {
		super();
		this.name = name;
		this.desciption = desciption;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
