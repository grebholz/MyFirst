package com.company;

/**
 * This class stores data about a textbook.
 */

public class TextBook {
	private String title; // Title of the book
	private String author; // Author's last name
	private String publisher; // Name of publisher
	
	//accessors and mutators
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	//constructors
	public TextBook(String textTitle, String auth, String pub) {
		title = textTitle;
		author = auth;
		publisher = pub;
	}

	public TextBook(TextBook object) {
		title = object.title;
		author = object.author;
		publisher = object.publisher;
	}

	public String toString() {
		// Create a string representing the object.
		String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;

		// Return the string.
		return str;
	}
}