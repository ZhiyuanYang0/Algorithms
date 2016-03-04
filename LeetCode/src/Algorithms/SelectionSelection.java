package Algorithms;

import java.util.Arrays;

public class SelectionSelection {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 2, 4, 6, 1};
		Selection(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void Selection(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = Integer.MAX_VALUE;
			int index = i;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] < min) {
					min = nums[j];
					index = j;
				}
			}
			int temp = nums[index];
			nums[index] = nums[i];
			nums[i] = temp;
		}
	}
}
