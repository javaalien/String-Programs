package com.alien;

// Write a Java Program to reverse a string without using String inbuilt function.

public class ReverseStringWithoutStringFunctions {

	public static void main(String[] args) {

		String str = "JavaAlien";

		char[] chars = str.toCharArray();

		int left = 0, right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}

		System.out.println(new String(chars));

	}

}
