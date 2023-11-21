package com.java.practice.string.codingquestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class KAnagramStrings {

	static boolean isKAnagramString(String str1, String str2, int k) {

		if (str1.length() != str2.length())
			return false;

		Arrays.sort(str1.toLowerCase().toCharArray());
		Arrays.sort(str2.toLowerCase().toCharArray());

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str1.length(); i++)
			map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
		for (int i = 0; i < str2.length(); i++) {
			if (map.getOrDefault(str2.charAt(i), 0) > 0)
				map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
		}

		int cntr = 0;

		for (char ch : map.keySet())
			cntr += map.get(ch);

		return (cntr <= k) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(isKAnagramString("fodr", "gork", 2));
	}

}
