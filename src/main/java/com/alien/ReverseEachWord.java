package com.alien;

// Java Program to Reverse Each Word of a String

public class ReverseEachWord {

	public static void main(String[] args) {

		String input = "Java is great and fun";

		// Call the method to reverse each word
		String result = reverseWords(input);

		// Print the result
		System.out.println("Original String: " + input);
		System.out.println("String with each word reversed: " + result);

	}

	private static String reverseWords(String str) {

		String[] words = str.split(" ");

		StringBuilder result = new StringBuilder();

		for (String word : words) {
			result.append(new StringBuilder(word).reverse().toString()).append(" ");
		}

		return result.toString().trim();
	}
}
