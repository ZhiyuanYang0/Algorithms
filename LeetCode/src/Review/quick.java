package Review;

import java.util.Arrays;

public class quick {

	public static void main(StringTest[] args) {
		int[] nums = {4,3,5,6,7,2,3,5,6};
		quickSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void quickSort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		
		int position = partition(nums, start, end);
		quickSort(nums, start, position - 1);
		quickSort(nums, position + 1, end);
		
	}
	
	public static int partition(int[] nums, int start, int end) {
		int pivot_position = findPosition(nums, start, end);
		int pivot = nums[pivot_position];
		swap(nums, pivot_position, end);
		int index = start;
		for (int i = start; i < end; i++) {		
			if (nums[i] < pivot) {
				swap(nums, index, i);
				index++;
			}
		}
		swap(nums, end, index);
//		System.out.println(Arrays.toString(nums));
//		System.out.println(index);
		return index;
	}
	
	public static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	private static int findPosition(int[] nums, int start, int end) {
		int mid = (start + end) / 2;
		if (nums[start] >= nums[end]) {
			if (nums[end] >= nums[mid]) {
				return end;
			} else if (nums[start] <= nums[mid]) {
				return start;
			} else {
				return mid;
			}
		} else if (nums[mid] >= nums[end]) {
			return end;
		} else if (nums[start] >= nums[mid]) {
			return start;
		} else {
			return mid;
		}
	}
}
