package com.alien;

// Write a Java Program to find whether a string is palindrome or not.

public class PalindromeString {

	public static void main(String[] args) {

		String str = "A man, a plan, a canal, Panama";

		boolean palindrome = isPalindrome(str);

		System.out.println(palindrome);

	}

	public static boolean isPalindrome(String input) {

		String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0, right = cleaned.length() - 1;
		while (left < right) {
			if (cleaned.charAt(left) != cleaned.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
