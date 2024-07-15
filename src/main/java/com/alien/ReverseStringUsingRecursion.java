package com.alien;

// Java Program to Reverse a String

public class ReverseStringUsingRecursion {

	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String original = "JAVA";
		System.out.println(reverseString(original));
	}
}
