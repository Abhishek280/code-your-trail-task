package com.pickyourtrail.developer.test.springmovietitles.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	public String Poster;
	public String Title;
	public String Type;
	public int Year;
	private String imdbID;
	
	
	
	public Data() {
		super();
	}



	public String getPoster() {
		return Poster;
	}



	public void setPoster(String poster) {
		Poster = poster;
	}



	public String getTitle() {
		return Title;
	}



	public void setTitle(String title) {
		Title = title;
	}



	public String getType() {
		return Type;
	}



	public void setType(String type) {
		Type = type;
	}



	public int getYear() {
		return Year;
	}



	public void setYear(int year) {
		Year = year;
	}



	public String getImdbID() {
		return imdbID;
	}



	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	@Override
	public String toString() {
		return "Data [Poster=" + Poster + ", Title=" + Title + ", Type=" + Type + ", Year=" + Year + ", imdbID="
				+ imdbID + "]";
	}


}
