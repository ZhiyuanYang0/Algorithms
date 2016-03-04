package Algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 2, 4, 6, 1};
		System.out.println(Arrays.toString(nums));
		quickSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}
	
    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int position = partition(nums, left, right);
        if (left < position - 1) {
            quickSort(nums, left, position - 1);
        }
        if (position + 1 < right) {
            quickSort(nums, position + 1, right);
        }
    }
    
    private static int partition(int[] nums, int left, int right) {
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
