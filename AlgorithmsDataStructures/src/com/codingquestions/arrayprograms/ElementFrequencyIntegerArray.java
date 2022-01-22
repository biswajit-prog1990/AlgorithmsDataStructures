package com.codingquestions.arrayprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ElementFrequencyIntegerArray {

	static Map<Integer, Integer> getFrequency(int[] xArr) {
		Map<Integer, Integer> freqMap = new LinkedHashMap<>();
		for (int i = 0; i < xArr.length; i++) {
			if (freqMap.containsKey(xArr[i]))
				freqMap.put(xArr[i], freqMap.get(xArr[i]) + 1);
			else
				freqMap.put(xArr[i], 1);
		}
		return freqMap;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> freqMap = getFrequency(new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 });
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
			System.out.println(entry.getKey() + " | " + entry.getValue());
	}

}
