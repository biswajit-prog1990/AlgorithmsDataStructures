package com.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * @author bisu9
 * 
 *         Efficient solution – A better solution is possible in O(n) time.
 *         Below is the Algorithm –
 * 
 *         Create a map to store frequency of each number in the array. (Single
 *         traversal is required) In the next traversal, for every element check
 *         if it can be combined with any other element (other than itself!) to
 *         give the desired sum. Increment the counter accordingly. After
 *         completion of second traversal, we’d have twice the required value
 *         stored in counter because every pair is counted two times. Hence
 *         divide count by 2 and return.
 *
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hmMap = new HashMap<>();
		for (int index = 0; index < nums.length; index++) {
			if (hmMap.containsKey(target - nums[index]))
				return new int[] { hmMap.get(target - nums[index]), index };
			else
				hmMap.put(nums[index], index);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 5, 11 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
