package com.alien;

// How to Check if a String Contains Only Letters in Java

public class CheckLettersUsingIsLetter {

	public static void main(String[] args) {

		String input = "HelloWorld";

		boolean result = containsOnlyLetters(input);

		System.out.println("Does the string contain only letters? " + result);

	}

	private static boolean containsOnlyLetters(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
