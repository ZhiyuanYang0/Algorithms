package Algorithms;

import java.util.Arrays;

public class partition {
	public static void main(String[] args) {
		int[] nums = {13,};
		partition2(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}
	

	
	  private static int partition2(int[] nums, int left, int right) {
	        int pivot = nums[left];
	        int start = left;
	        int index = left;
	        while (left <= right) {
	            if (nums[left] < pivot) {
	               index++;
	               swap(nums, index, left);
	            }
	            left++;
	        }
	        swap(nums, start, index);
	        return index;
	    }
	  
	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
}
