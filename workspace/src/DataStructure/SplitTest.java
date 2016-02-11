package DataStructure;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		String str = "12333.00000.1111";
		String[] s = str.split("\\.");
		System.out.println(Arrays.toString(s));
		String[] s1 = str.split("//.");
		System.out.println(Arrays.toString(s1));
		System.out.println(s1.length);
		
		int[] nums = {1,2,3};
//		System.out.println(Arrays.toString(nums));
		rotate(nums, 1);
//		System.out.println(Arrays.toString(nums));		
	}

	public static void rotate(int[] nums, int k) {
		if (k > nums.length) {
			k = nums.length - 1;
		}
		System.out.println(Arrays.toString(nums));	
		int length = nums.length;
		for (int start = 0, end = length - 1; start < k; start++, end--) {
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			System.out.println(Arrays.toString(nums));	
		}
	}
}
