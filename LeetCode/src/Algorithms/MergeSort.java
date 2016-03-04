package Algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 2, 4, 6, 1};
		System.out.println(Arrays.toString(nums));
		mergeSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, mid + 1, right); 
    }
    
    public static void merge(int[] nums, int left1, int right1, int left2, int right2) {
        int start = left1;
        int[] ans = new int[right2 - left1 + 1];
        int index = 0;
        while (left1 <= right1 || left2 <= right2) {
            if (left1 > right1) {
                    ans[index] = nums[left2];
                    left2++;
            } else if (left2 > right2) {
                    ans[index] = nums[left1];
                    left1++;
            } else if (nums[left1] <= nums[left2]) {
                ans[index] = nums[left1];
                left1++;
            } else {
                ans[index] = nums[left2];
                left2++;

            }	
            index++;
        }
        for (int i = 0; i < ans.length; i++) {
            nums[start] = ans[i];
            start++;
        }

    }
}
