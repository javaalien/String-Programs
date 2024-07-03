package com.alien;

// Write a Java Program to find whether a string is palindrome or not.

public class PalindromeString {

	public static void main(String[] args) {

		String str = "madam";

		boolean palindrome = isPalindrome(str);

		System.out.println(palindrome);

	}

	public static boolean isPalindrome(String input) {
		int left = 0, right = input.length() - 1;
		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
