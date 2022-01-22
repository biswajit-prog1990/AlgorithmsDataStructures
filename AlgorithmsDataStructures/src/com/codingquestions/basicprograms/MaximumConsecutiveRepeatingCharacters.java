package com.codingquestions.basicprograms;

public class MaximumConsecutiveRepeatingCharacters {

	static int maxRepeatingChars(String str) {
		int count = 0;
		int maxCount = 0;
		char previous = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == previous)
				count++;
			else {
				count = 1;
				previous = ch;
			}
			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}

	public static void main(String[] args) {
		System.out.println(maxRepeatingChars("aaaaabbcccddddeeeeeedcbaee"));
	}

}
