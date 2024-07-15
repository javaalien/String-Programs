package com.alien;

import java.util.HashSet;
import java.util.Set;

// Java Program to Remove Duplicate Words from a String using StringBuilder

public class RemoveDuplicateWordsTraditional {

	public static void main(String[] args) {

		String input = "Java is great and Java is fun and Java is powerful";

		String result = removeDuplicateWords(input);

		System.out.println("Original String: " + input);
		System.out.println("String after removing duplicates: " + result);

	}

	private static String removeDuplicateWords(String input) {

		String[] words = input.split(" ");

		Set<String> wordSet = new HashSet<>();

		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (!wordSet.contains(word)) {
				wordSet.add(word);
				result.append(word).append(" ");
			}
		}
		return result.toString().trim();
	}
}
