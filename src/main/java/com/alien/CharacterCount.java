package com.alien;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// Java Program to Count the Occurrences of Each Character

public class CharacterCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = scanner.nextLine();

		Map<Character, Integer> charCount = countCharacters(input);

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static Map<Character, Integer> countCharacters(String str) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		return map;
	}

}
