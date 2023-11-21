package com.java.practice.string.codingquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {

	static boolean isIsomorphic(String str1, String str2) {
		Map<Character, Character> map = new LinkedHashMap<>();

		if (str1 == null || str2 == null || str1.length() != str2.length())
			return false;

		for (int i = 0; i < str1.length(); i++) {
			if (map.containsKey(str1.charAt(i))) {
				if (map.get(str1.charAt(i)) != str2.charAt(i))
					return false;
			} else {
				if (map.containsValue(str2.charAt(i)))
					return false;
				map.put(str1.charAt(i), str2.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("aab", "xyz"));
	}

}
