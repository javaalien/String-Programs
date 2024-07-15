package com.alien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Java Program to Count Occurrences of Words in a String

public class WordCounter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string:");
		String input = scanner.nextLine();

		Map<String, Integer> wordCounts = countWords(input);

		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static Map<String, Integer> countWords(String str) {

		String[] split = str.split(" ");
		Map<String, Integer> map = new HashMap<>();

		for (String word : split) {
			word = word.toLowerCase();
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		return map;
	}
}
