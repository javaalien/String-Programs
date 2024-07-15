package com.alien;

//  Write a Java program to check if a given string is a palindrome

public class StringPalindromeCheck {

	public static void main(String[] args) {

		String input = "level";
		boolean isPalindrome = isPalindrome(input);
		System.out.println("Is Palindrome: " + isPalindrome);

	}

	private static boolean isPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
