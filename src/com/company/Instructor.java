package com.company;

/**
 * This class stores data about an instructor.
 */

public class Instructor {
	private String lastName; // Last name
	private String firstName; // First name
	private String officeNumber; // Office number
	
	//accessors and mutators
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	//constructors
	public Instructor(String lname, String fname, String office) {
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}


	public Instructor(Instructor object) {
		lastName = object.lastName;
		firstName = object.firstName;
		officeNumber = object.officeNumber;
	}

	public String toString() {
		// Create a string representing the object.
		String str = "Last Name: " + lastName + "\nFirst Name: " + firstName + "\nOffice Number: " + officeNumber;

		// Return the string.
		return str;
	}
	
	
}