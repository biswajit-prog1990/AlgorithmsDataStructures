package com.codingquestions.arrayprograms;

import java.util.Arrays;

public class ArrayReverse {

	static int[] arrayReverse(int[] input) {
		int[] returnArr = new int[input.length];
		int inputCntr = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			returnArr[inputCntr] = input[i];
			inputCntr++;
		}
		return returnArr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrayReverse(new int[] { 5, 66, 7, 99, 1, 15 })));
	}

}
