package com.codingquestions.basicprograms;

public class ArmstrongNumber {

	static boolean checkArmstrong(int number) {
		int temp = number;
		int digits = 0;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = number;
		int sum = 0;
		while (temp > 0) {
			int r = temp % 10;
			sum += Math.pow(r, digits);
			temp = temp / 10;
		}
		if (sum == number)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkArmstrong(1675) ? "Armstrong Number" : "Not Armstrong Number");
	}

}
