package com.alien;

import java.util.Arrays;
import java.util.stream.Collectors;

// Java Program to Reverse Each Word of a String using streams

public class ReverseEachWordWithStreams {

	public static void main(String[] args) {

		String input = "Java is great and fun";

		// Call the method to reverse each word using streams
		String result = reverseWords(input);

		// Print the result
		System.out.println("Original String: " + input);
		System.out.println("String with each word reversed using streams: " + result);

	}

	private static String reverseWords(String str) {

		return Arrays.stream(str.split("\\s+"))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
	}
}
