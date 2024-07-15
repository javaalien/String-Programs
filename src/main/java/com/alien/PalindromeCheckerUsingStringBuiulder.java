package com.alien;

public class PalindromeCheckerUsingStringBuiulder {

	public static void main(String[] args) {

		String str = "A man, a plan, a canal, Panama";
		boolean palindrome = isPalindrome(str);
		System.out.println(palindrome);

	}

	private static boolean isPalindrome(String str) {

		String cleaned = str.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
		String reversed = new StringBuilder(cleaned).reverse().toString();
		return cleaned.equals(reversed);
	}
}
