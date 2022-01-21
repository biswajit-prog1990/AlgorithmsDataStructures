package com.codingquestions.basicprograms;

public class PrimeNumber {

	static int checkPrime(int number) {
		if (number <= 1)
			return 0;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int isPrime = checkPrime(17);
		System.out.println(isPrime == 0 ? "Not a Prime Number" : "Prime Number");
	}

}
