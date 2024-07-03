package com.alien;

import java.util.HashMap;
import java.util.Map;

// Write a Java Program to count the number of words in a string using HashMap.

public class CountNumberofWordsUsingHashMap {

	public static void main(String[] args) {

		String str = "Java is awesome and Java is object oriented";

		Map<String, Integer> wordCount = new HashMap<>();

		String[] words = str.split("\\s+");

		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		System.out.println(wordCount);

	}

}
