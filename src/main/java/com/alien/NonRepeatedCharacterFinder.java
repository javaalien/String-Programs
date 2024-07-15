package com.alien;

import java.util.LinkedHashMap;
import java.util.Map;

// Java Program to Find the First Non-repeated Character in a String

public class NonRepeatedCharacterFinder {

	public static void main(String[] args) {

		String text = "Java Alien";
		char result = firstNonRepeatedCharacter(text);
		if (result != '\0') {
			System.out.println("The first non-repeated character is: " + result);
		} else {
			System.out.println("All characters are repeated.");
		}

	}

	private static char firstNonRepeatedCharacter(String input) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Step 2: Find the first character with a count of 1
		for (char ch : input.toCharArray()) {
			if (map.get(ch) == 1) {
				return ch;
			}
		}
		return '\0';
	}
}
