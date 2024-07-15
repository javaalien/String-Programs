package com.alien;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringCountExample {

	public static void main(String[] args) {

		String input = "Java is great. Java is fun. Java is powerful.";
		String substring = "Java";

		String[] parts = input.split(substring);
		int count = parts.length - 1;

		System.out.println("Number of occurrences using split(): " + count);

		Pattern pattern = Pattern.compile(substring);

		Matcher matcher = pattern.matcher(input);

		int countusingRegEx = 0;
		while (matcher.find()) {
			countusingRegEx++;
		}
		System.out.println("Number of occurrences using regex: " + countusingRegEx);
	}
}
