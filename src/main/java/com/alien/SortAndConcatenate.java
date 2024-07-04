package com.alien;

import java.util.Arrays;

// Write a program that accepts comma-separated strings, sorts the strings in ascending order, 
// and outputs the concatenated string of sorted strings.

public class SortAndConcatenate {

	public static void main(String[] args) {

		String input = "java,is,platform,independent,language";

		String[] parts = input.split(",");

		Arrays.sort(parts);

		System.out.println(String.join(" ", parts));

	}

}
