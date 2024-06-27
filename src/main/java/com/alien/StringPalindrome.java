package com.alien;

// How do you determine if a string is a palindrome?

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "madam";

		String reverseString = reverseString(str);

		if (reverseString.equals(str)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrom String");
		}

	}

	private static String reverseString(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
}
