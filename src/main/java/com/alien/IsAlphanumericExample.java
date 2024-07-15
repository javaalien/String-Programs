package com.alien;

// Program to Checks if the CharSequence contains only Unicode letters or digits

public class IsAlphanumericExample {

	public static void main(String[] args) {

		boolean isAlphanumeric = isAlphanumeric(null);
		boolean isAlphanumeric2 = isAlphanumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl");
		boolean isAlphanumeric3 = isAlphanumeric("a");
		boolean isAlphanumeric4 = isAlphanumeric(" ");
				
		System.out.println(isAlphanumeric);
		System.err.println(isAlphanumeric2);
		System.err.println(isAlphanumeric3);
		System.err.println(isAlphanumeric4);
	}

	private static boolean isAlphanumeric(CharSequence seq) {

		if (isEmpty(seq)) {
			return false;
		}

		int size = seq.length();
		for (int i = 0; i < size; i++) {
			if (!Character.isLetterOrDigit(seq.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isEmpty(CharSequence seq) {

		return seq == null || seq.length() == 0;
	}
}
