package com.alien;

import java.util.HashMap;
import java.util.Map;

// Java Program to Find the Occurrence of Words in a String using HashMap

public class WordOccurrenceInString {

	public static void main(String[] args) {

		String text = "this is a test this is only a test";

		String[] words = text.split(" ");

		Map<String, Integer> wordCounts = new HashMap<>();

		for (String word : words) {
			if (wordCounts.containsKey(word)) {
				wordCounts.put(word, wordCounts.get(word) + 1);
			} else {
				wordCounts.put(word, 1);
			}
		}

		System.out.println("Word occurrences:");
		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
