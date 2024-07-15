package com.alien;

// // Java Program to Reverse a String

public class ReverseStringUsingCharacterArray {

	public static void main(String[] args) {
		String original = "JAVA";
		char[] chars = original.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
	}
}
