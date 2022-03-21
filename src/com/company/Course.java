package com.company;

/**
 * This class stores data about a course.
 */

public class Course {
	private String courseName; // Name of the course
	private Instructor instructor; // The instructor
	private TextBook textBook; // The textbook

	// accessors and mutators
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public TextBook getTextBook() {
		return textBook;
	}

	public void setTextBook(TextBook textBook) {
		this.textBook = textBook;
	}

	//constructors
	public Course(String courseName, Instructor instructor, TextBook textBook) {
		super();
		this.courseName = courseName;
		this.instructor = instructor;
		this.textBook = textBook;
	}
	
	public Course() {
		this.courseName = "Database Systems";
		this.instructor = new Instructor("Allen", "Jones", "SMI345");
		this.textBook = new TextBook("Intro to Databases", "Thompson", "Cengage");
	}

	@Override
	public String toString() {
		return "Course{" +
				"courseName='" + courseName + '\'' +
				", instructor=" + instructor +
				", textBook=" + textBook +
				'}';
	}
}