package com.codingquestions.basicprograms;

import java.util.Scanner;

//0 1 1 2 3 5 7 9 ....

public class FibonacciSeries {

	static int a = 0, b = 1, c = 0;

	static void printFibonacci(int n) {
		int a = 0, b = 1, c = 0;
		System.out.print(a + " " + b);
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

	static void printFibonacciRecursion(int n) {
		if (n == 0 || n == 1)
			return;
		else {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			printFibonacciRecursion(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter number of elements:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printFibonacci(n);
		System.out.println();
		System.out.print(a + " " + b);
		printFibonacciRecursion(n - 1);
	}

}
