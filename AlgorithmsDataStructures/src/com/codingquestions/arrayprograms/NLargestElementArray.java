package com.codingquestions.arrayprograms;

import java.util.Arrays;

public class NLargestElementArray {

	static int findNLargestElement(int[] input, int index) {
		// Sort the array in ascending order
		Arrays.sort(input);
		return input[input.length - index];
	}

	public static void main(String[] args) {
		System.out.println("Number at Nth position = "
				+ findNLargestElement(new int[] { 15, 22, 100, 1, 67, 82, 99, 187, 522 }, 4));
	}

}
