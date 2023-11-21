package com.java.practice.string.codingquestions;

public class ReverseWordsString {

	static String reverseWordsString(String str) {
		String reverse = "";

		String[] strArr = str.split("\\.");
		for (int i = strArr.length - 1; i >= 0; i--) {
			reverse += strArr[i];
			if (i != 0)
				reverse += ".";
		}

		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverseWordsString("i.like.this.program.very.much"));
	}

}
