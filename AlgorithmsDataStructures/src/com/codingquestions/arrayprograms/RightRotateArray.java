package com.codingquestions.arrayprograms;

import java.util.Arrays;

public class RightRotateArray {

	static int[] rightRotateArray(int[] input, int rotatedIndex) {
		for (int i = 0; i < rotatedIndex; i++) {
			int j, last;
			last = input[input.length - 1];
			for (j = input.length - 1; j > 0; j--)
				input[j] = input[j - 1];
			input[0] = last;
		}
		return input;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(rightRotateArray(new int[] { 1, 67, 5, 14, 7, 99, 12 }, 4)));
	}

}
