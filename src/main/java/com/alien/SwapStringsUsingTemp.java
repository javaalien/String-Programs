package com.alien;

// Java Program to Swap Two Strings using temp

public class SwapStringsUsingTemp {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";

		System.out.println("Before swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		// Swapping using a temporary variable
		String temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.println("\nAfter swap:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

	}
}
