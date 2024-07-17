package com.alien;

import java.util.HashMap;
import java.util.Map;

// Java Program to Find Maximum Occurring Character in String

public class MaxOccurringChar {

	public static void main(String[] args) {

		String str = "java alien";
		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		for (Character ch : str.toCharArray()) {
			charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
		}
		int maxFrequency = 0;
		char maxOccurringChar = ' ';

		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			if (entry.getValue() > maxFrequency) {
				maxFrequency = entry.getValue();
				maxOccurringChar = entry.getKey();
			}
		}

		System.out
				.println("Maximum occurring character: '" + maxOccurringChar + "' with a frequency of " + maxFrequency);
	}
}
