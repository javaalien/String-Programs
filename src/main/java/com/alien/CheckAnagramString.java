package com.alien;

import java.util.Arrays;

// How to find out if the given two strings are anagrams or not?

public class CheckAnagramString {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		if (areAnagram(str1, str2)) {
			System.out.println("Given two Strings are Anagram");
		} else {
			System.out.println("Given two String are not anagaram");
		}
	}

	private static boolean areAnagram(String str1, String str2) {

		char[] anagram1 = str1.toCharArray();
		char[] anagram2 = str2.toCharArray();

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 != len2)
			return false;

		Arrays.sort(anagram1);
		Arrays.sort(anagram2);

		boolean equals = Arrays.equals(anagram1, anagram2);

		return equals;

	}

}
