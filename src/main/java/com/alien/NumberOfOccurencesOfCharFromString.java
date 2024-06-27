package com.alien;

// Find the number of occurrences of a character in a String?

public class NumberOfOccurencesOfCharFromString {

	public static void main(String[] args) {
		
		String str="javaalien";
		char search='a';
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == search) {
				count++;
			}
		}		
		System.out.println("Count of : "+search+ " in String "+str+ " = "+count);
	}

}
