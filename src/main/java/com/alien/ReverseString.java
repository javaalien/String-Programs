package com.alien;

//  How do you reverse a string in Java?

public class ReverseString {

	public static void main(String[] args) {

		String str = "javaalien";
		String reverse = "";

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}
