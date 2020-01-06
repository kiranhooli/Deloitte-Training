package com.deloitte.itcinema.model;

import java.util.ArrayList;

public class Movie {
	private int movieId;
	private String movieName;
	private double movierating;
	private ArrayList<String> availableSeats;
	private int totalSeats;
	private String posterURL;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getMovierating() {
		return movierating;
	}
	public void setMovierating(double movierating) {
		this.movierating = movierating;
	}
	public ArrayList<String> getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(ArrayList<String> availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public String getPosterURL() {
		return posterURL;
	}
	public void setPosterURL(String posterURL) {
		this.posterURL = posterURL;
	}
	
}
