package com.codingquestions.arrayprograms;

public class AddMatrixArray {

	static int[][] add2DMatrix(int[][] input1, int[][] input2) {
		int[][] output = new int[input1.length][input1[0].length];
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				output[i][j] = input1[i][j] + input2[i][j];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[][] input1 = { { 1, 3, 4, 7 }, { 8, 10, 11, 15 }, { 9, 17, 18, 27 }, { 32, 54, 6, 78 } };
		int[][] input2 = { { 33, 44, 56, 78 }, { 1, 15, 6, 78 }, { 2, 3, 5, 6 }, { 12, 13, 56, 6 } };
		int[][] output = add2DMatrix(input1, input2);
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[i].length; j++)
				System.out.print(" " + output[i][j]);
			System.out.println();
		}
	}

}
