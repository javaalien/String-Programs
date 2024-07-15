package com.alien;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Java Program to Find Duplicate Characters in a String

public class DuplicateCharacterFinder {

	public static void main(String[] args) {

		String text = "Java Alien Coding";

		System.out.println("Duplicate characters in the string are:");
		findDuplicates(text);

	}

	private static void findDuplicates(String text) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : text.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " ");
			}
		}
	}
}
