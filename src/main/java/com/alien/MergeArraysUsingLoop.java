package com.alien;

import java.util.Iterator;

// Java Program to Merge Two String Arrays

public class MergeArraysUsingLoop {

	public static void main(String[] args) {

		String[] array1 = { "Java", "is", "fun" };
		String[] array2 = { "and", "powerful" };

		String[] mergedArray = new String[array1.length + array2.length];
		int index = 0;

		for (String element : array1) {
			mergedArray[index++] = element;
		}

		for (String element : array2) {
			mergedArray[index++] = element;
		}

		System.out.println("Merged Array using Loop: ");
		for (String element : mergedArray) {
			System.out.print(element + " ");
		}
	}
}
