package com.codingquestions.arrayprograms;

import java.util.Arrays;

public class LeftRotateArray {

	static int[] getLeftRotateArray(int[] input, int rotationIndex) {
		for (int i = 0; i < rotationIndex; i++) {
			int first = input[0];
			int j;
			for (j = 0; j < input.length - 1; j++)
				input[j] = input[j + 1];
			input[j] = first;
		}
		return input;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getLeftRotateArray(new int[] { 5, 6, 9, 11, 16, 17, 21 }, 3)));
	}

}
