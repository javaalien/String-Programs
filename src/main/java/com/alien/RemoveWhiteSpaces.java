package com.alien;

// Write a Java Program to remove all white spaces from a string without using replace().

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "Java is object oriented programming";

		removeWhitespaces(str);

	}

	private static void removeWhitespaces(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
		}
		System.out.println(result.toString());
	}
}
