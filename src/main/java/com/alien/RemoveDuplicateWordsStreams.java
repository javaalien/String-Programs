package com.alien;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Java Program to Remove Duplicate Words from a String using Streams

public class RemoveDuplicateWordsStreams {

	public static void main(String[] args) {

		String input = "Java is great and Java is fun and Java is powerful";

		String result = removeDuplicateWords(input);

		System.out.println("Original String: " + input);
		System.out.println("String after removing duplicates: " + result);

	}

	private static String removeDuplicateWords(String input) {

		Set<String> collect = Arrays.stream(input.split(" ")).collect(Collectors.toCollection(LinkedHashSet::new));

		return String.join(" ", collect);
	}
}
