package com.codingquestions.basicprograms;

public class Factorial {

	static int findFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}

	static int findFactorialRecursion(int number) {
		if (number == 0 || number == 1)
			return 1;
		return number * findFactorialRecursion(number - 1);
	}

	public static void main(String[] args) {
		System.out.println(findFactorial(5));
		System.out.println(findFactorialRecursion(6));
	}

}
