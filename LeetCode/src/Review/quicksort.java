package Review;

import java.util.Arrays;

public class quicksort {
	
	public static void main(StringTest[] args) {
		int[] nums = {4,3,5,6,7,2,3,5,6};
		quickSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	private static int partition(int[] nums, int i, int j) {  
        int pivot = nums[i];  
        int start;
        int end = j;
        int index = i;
        System.out.println(Arrays.toString(nums));
        for (start = i + 1; start <= end; start++) {
            if (nums[start] < pivot) {
                index++;
                swap(nums, index, start);
                System.out.println("index = " + index + "start = " + start + Arrays.toString(nums));
            }
        }
 //       System.out.println("after = " + Arrays.toString(nums) + "index =" + index);
        swap(nums, i, index);  
        return index;  
    }  
    
    private static void swap(int[] nums, int i, int j) {  
        int temp = nums[i];  
        nums[i] = nums[j];  
        nums[j] = temp;  
    }  
 
private static void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index)
            quickSort(arr, left, index);
      if (index + 1 < right)
            quickSort(arr, index + 1, right);
}
    
}

