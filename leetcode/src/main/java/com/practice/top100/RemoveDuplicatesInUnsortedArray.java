package com.practice.top100;

import java.util.Arrays;

/*
 * Program to remove duplicate elements from an array where the range of numbers in between 0 and n.
 * Program uses constant space and O(n) time to move all the unique elements at the front of the array and returns
 * the length till which the unique elements are stored.
 * 
 * */
public class RemoveDuplicatesInUnsortedArray {

	public static void main(String[] args) {
		int[] nums = {3,3,4,2,1,4};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	public static int removeDuplicates(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] >= 0 && nums[nums[i]] > 0) {
				nums[nums[i]] = -nums[nums[i]];
			} else if (nums[i] < 0 && nums[Math.abs(nums[i])] > 0) {
				nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
			}
		}

		int count = 0;
		int currentIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0) {
				currentIndex++;
				nums[currentIndex] = i;
				count++;
			}
		}
		return count;
	}
	
}
