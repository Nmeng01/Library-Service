package classes;

import java.util.ArrayList;

public class Movie extends LibraryItem {
	
	private String director;
	private ArrayList<String> reviews;
	private String format;
	private ArrayList<String> notableActors;
	
	public Movie(String name, boolean isBorrowed, String genre, String format) {
		super(name, isBorrowed, genre);
		this.format = format;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<String> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<String> reviews) {
		this.reviews = reviews;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public ArrayList<String> getNotableActors() {
		return notableActors;
	}
	public void setNotableActors(ArrayList<String> notableActors) {
		this.notableActors = notableActors;
	}

	@Override
	public String toString() {
		return this.getName() + " (Movie)";

	}
	
	

}
