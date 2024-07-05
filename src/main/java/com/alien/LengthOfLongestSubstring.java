package com.alien;

// Given a string s, find the length of the longest substring without repeating characters.

public class LengthOfLongestSubstring {

	public static void main(String[] args) {

		String str = "ABCDEFGABEF";

		int len = lengthOfLongestSubstring(str);

		System.out.println(len);

	}

	private static int lengthOfLongestSubstring(String str) {
		int[] chars = new int[128]; // There are 128 ASCII characters
		int left = 0, right = 0;
		int res = 0;
		while (right < str.length()) {
			char r = str.charAt(right);
			chars[r]++;
			while (chars[r] > 1) {
				char l = str.charAt(left);
				chars[l]--;
				left++;
			}
			res = Math.max(res, right - left + 1);
			right++;
		}
		return res;
	}
}
