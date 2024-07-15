package com.alien;

// Swapping Strings Using a Wrapper Class

public class SwapStringsUsingWrapper {

	public static void main(String[] args) {

		StringWrapper str1 = new StringWrapper("Hello");
		StringWrapper str2 = new StringWrapper("World");

		System.out.println("Before swap:");
		System.out.println("str1: " + str1.value);
		System.out.println("str2: " + str2.value);

		// Swapping using a method and wrapper class
		swapStrings(str1, str2);

		System.out.println("\nAfter swap:");
		System.out.println("str1: " + str1.value);
		System.out.println("str2: " + str2.value);

	}

	private static void swapStrings(StringWrapper str1, StringWrapper str2) {

		String temp = str1.value;
		str1.value = str2.value;
		str2.value = temp;

	}
}

class StringWrapper {
	String value;

	StringWrapper(String value) {
		this.value = value;
	}
}