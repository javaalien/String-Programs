package com.alien;

// // Java Program to Reverse a String

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {

		String original = "JAVA";
		StringBuilder buffer = new StringBuilder(original);
		System.out.println(buffer.reverse());

	}
}
