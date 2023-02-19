package com.jarvis.objectcomposition;

public class Review {

	private int id;
	private String description;
	private byte rating;

	public Review(int id, String description, byte rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}

}
