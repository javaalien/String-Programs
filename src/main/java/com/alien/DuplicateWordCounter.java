package com.alien;

import java.util.HashMap;
import java.util.Map;

// Java program to Count Number of Duplicate Words in String

public class DuplicateWordCounter {

	public static void main(String[] args) {

		String input = "Java is great and Java is fun. Programming in Java is great";

		String lowerCase = input.toLowerCase();

		String[] words = lowerCase.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		System.out.println("Duplicate words in the string:");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
