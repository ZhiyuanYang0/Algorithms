package Algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 2, 4, 6, 1};
		System.out.println(Arrays.toString(nums));
		Insertion(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void Insertion(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (nums[j] < nums[j - 1]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}
	}
}
