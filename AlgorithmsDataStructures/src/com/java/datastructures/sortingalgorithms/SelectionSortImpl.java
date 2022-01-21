package com.java.datastructures.sortingalgorithms;

public class SelectionSortImpl {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest])
					largest = i;
			}

			swap(intArray, largest, lastUnsortedIndex);
		}

		for (int x : intArray) {
			System.out.print(x + " ");
		}
	}

	public static void swap(int[] intArray, int i, int j) {
		if (i == j)
			return;

		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
