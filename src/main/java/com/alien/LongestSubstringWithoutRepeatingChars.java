package com.alien;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Write a Java program to find the length of the longest substring without repeating characters

public class LongestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {

		String input = "abcabcbb";
		int length = findLongestSubstringLength(input);
		System.out.println("Length of the longest substring without repeating characters: " + length);

	}

	private static int findLongestSubstringLength(String str) {

		if (str == null || str.length() == 0) {
			return 0;
		}

		int maxLength = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0, j = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (map.containsKey(currentChar)) {
				j = Math.max(j, map.get(currentChar) + 1);
			}
			map.put(currentChar, i);
			maxLength = Math.max(maxLength, i - j + 1);
		}

		return maxLength;
	}
}
