package com.codingquestions.arrayprograms;

public class LargestElementArray {

	static int findLargest(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max)
				max = input[i];
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest Element = " + findLargest(new int[] { 1, 78, 16, 32, 98, 45, 123, 176, 18 }));
	}

}
