package com.codingquestions.basicprograms;

public class PalindromeString {

	static boolean isPalindromeString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverse += str.charAt(i);
		if (str.equals(reverse))
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindromeString("malayalam") ? "Palindrome String" : "Not a Palindrome String");
	}

}
