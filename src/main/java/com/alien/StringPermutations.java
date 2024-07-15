package com.alien;

// Java Program to Find All the Permutations of a String

public class StringPermutations {

	public static void main(String[] args) {

		String input = "abc";
		generatePermutations(input, "");
		System.out.println("All permutations of " + input + " have been displayed.");

	}

	private static void generatePermutations(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			generatePermutations(remaining, ans + ch);
		}
	}
}
