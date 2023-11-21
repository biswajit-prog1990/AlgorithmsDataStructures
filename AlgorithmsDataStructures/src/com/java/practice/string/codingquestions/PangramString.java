package com.java.practice.string.codingquestions;

import java.util.HashSet;
import java.util.Set;

public class PangramString {

	static boolean isPangram(String str) {
		if (str.length() < 26)
			return false;

		Set<Character> charSet = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			if (((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90)
					|| (int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)
				charSet.add(str.charAt(i));
		}

		return (charSet.size() == 26) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(isPangram("Bawds jog, flick quartz, vex nymph"));
	}

}
