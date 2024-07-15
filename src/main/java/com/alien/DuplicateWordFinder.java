package com.alien;

import java.util.HashMap;
import java.util.Map;

// Java Program to Find Duplicate Words in a String

public class DuplicateWordFinder {

	public static void main(String[] args) {

		String sentence = "Java is a programming language and Java is also a platform";

		System.out.println("Duplicate words in the string are:");
		findDuplicateWords(sentence);

	}

	private static void findDuplicateWords(String str) {

		String[] words = str.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			String wordLowerCase = word.toLowerCase();
			map.put(wordLowerCase, map.getOrDefault(wordLowerCase, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
			}
		}
	}
}
