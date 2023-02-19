package com.jarvis.objectcomposition;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(123, "OOPS with Java", "Ranga");
		System.out.println(book);

		book.addReview(new Review(10, "Great Book", (byte) 5));
		System.out.println(book);

		book.addReview(new Review(101, "Awesome", (byte) 5));

		System.out.println(book);
	}

}
