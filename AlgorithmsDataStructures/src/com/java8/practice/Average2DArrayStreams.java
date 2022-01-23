package com.java8.practice;

import java.util.Arrays;

public class Average2DArrayStreams {

	public static void main(String[] args) {
		int[][] xArr = { { 1, 2, 3, 4 }, { 6, 9, 7, 10 }, { 15, 22, 45, 66 }, { 18, 20, 92, 65 }, { 17, 18, 99, 23 } };
		double avg = Arrays.stream(xArr).flatMapToInt(Arrays::stream).average().getAsDouble();
		System.out.println("Average = " + avg);
	}

}
