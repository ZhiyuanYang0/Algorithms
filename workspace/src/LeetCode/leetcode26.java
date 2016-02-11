package LeetCode;

public class leetcode26 {

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3,4};
		removeDuplicates(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		} 
		int i = 1;
		int j = 0;
		while (i < nums.length) {
			if (nums[i] == nums[j]) {
				i++;
			} else {
				j++;
				nums[j] = nums[i];
				i++;
				
			}
		}
		return j;
	}
}
