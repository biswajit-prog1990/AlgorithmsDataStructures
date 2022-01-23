package com.codingquestions.arrayprograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DuplicateElementsArray {

	static Integer[] findDuplicateElements(int[] input) {
		List<Integer> duplicates = new LinkedList<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j])
					duplicates.add(input[i]);
			}
		}
		return duplicates.toArray(new Integer[duplicates.size()]);
	}

	public static void main(String[] args) {
		System.out
				.println(Arrays.toString(findDuplicateElements(new int[] { 5, 6, 2, 15, 5, 7, 88, 7, 9, 64, 2, 88 })));
	}

}
