package com.alien;

// How do you calculate the number of vowels and consonants in a String?

public class CountStringVowelsConsonants {

	public static void main(String[] args) {

		String str = "javaalien";

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}

		System.out.println("Vowel count is " + vowels);

		System.out.println("Consonant count is: " + consonants);
	}
}
