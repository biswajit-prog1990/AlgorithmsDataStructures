package com.codingquestions.arrayprograms;

public class SmallestElementArray {

	static int findSmallest(int[] input) {
		int smallest = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < smallest)
				smallest = input[i];
		}
		return smallest;
	}

	public static void main(String[] args) {
		System.out.println("Smallest Number = " + findSmallest(new int[] { 11, 3, 45, 6, 77, 2, 98, 16 }));
	}

}
