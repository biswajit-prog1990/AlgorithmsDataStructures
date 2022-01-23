package com.codingquestions.arrayprograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OddEvenElementsArray {

	static Integer[] printOddEvenElements(int[] input, boolean findOdd, boolean findEven) {
		List<Integer> returnArr = new LinkedList<>();
		for (int i = 0; i < input.length; i++) {
			if (findOdd) {
				if ((i + 1) != input.length + 1 && (i + 1) % 2 != 0)
					returnArr.add(input[i]);
			} else if (findEven) {
				if ((i + 1) != input.length + 1 && (i + 1) % 2 == 0)
					returnArr.add(input[i]);
			}
		}
		return returnArr.toArray(new Integer[returnArr.size()]);
	}

	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(printOddEvenElements(new int[] { 1, 5, 9, 16, 23, 65, 7, 84, 99, 123 }, true, false)));
	}

}
