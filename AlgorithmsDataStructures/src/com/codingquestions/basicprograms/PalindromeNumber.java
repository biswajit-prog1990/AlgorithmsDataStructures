package com.codingquestions.basicprograms;

public class PalindromeNumber {

	static int isPalindromeNumber(int num) {
		int temp = num;
		int sum = 0, r;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isPalindromeNumber(454) == 1 ? "Palindrome Number" : "Not a Palindrome Number");
	}

}
