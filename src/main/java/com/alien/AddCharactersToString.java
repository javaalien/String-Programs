package com.alien;

// Java Program to Add Characters to a String

public class AddCharactersToString {

	public static void main(String[] args) {
		String baseString = "Hello";

		// Step 2: Adding characters using the + operator
		String updatedString = baseString + ", Alien!";
		System.out.println("Using + operator: " + updatedString);

		// Step 3: Adding characters using the concat() method
		String concatString = baseString.concat(", Alien!");
		System.out.println("Using concat() method: " + concatString);

		// Step 4: Using StringBuilder to append characters
		StringBuilder sb = new StringBuilder(baseString);
		sb.append(", Alien!");
		System.out.println("Using StringBuilder: " + sb.toString());
	}
}
