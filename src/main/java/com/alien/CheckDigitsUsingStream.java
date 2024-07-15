package com.alien;

//How to Check if a String Contains Only Digits in Java

public class CheckDigitsUsingStream {

	public static void main(String[] args) {

		String input = "123456";

		boolean result = containsOnlyDigits(input);

		System.out.println("Does the string contain only digits? " + result);

	}

	private static boolean containsOnlyDigits(String str) {

		return str.chars().allMatch(Character::isDigit);
	}
}
