package com.alien;

// Given a string s, return true if s is a "good" string, or false otherwise. 
// A string s is good if all characters that appear 
// in s have the same number of occurrences (i.e., the same frequency).

public class GoodString_AreOccurrencesEqual {

	public static void main(String[] args) {

		String str = "abacbc";
		boolean res = areOccurrencesEqual(str);

		System.out.println(res);
	}

	private static boolean areOccurrencesEqual(String str) {

		int[] count = new int[26];

		for (char c : str.toCharArray()) {
			count[c - 'a']++;
		}

		int frequency = 0;

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				if (frequency == 0) {
					frequency = count[i]; // Set the first non-zero frequency found
				} else if (frequency != count[i]) {
					return false; // Return false if any frequency doesn't match the first found
				}
			}
		}
		return true;
	}
}
