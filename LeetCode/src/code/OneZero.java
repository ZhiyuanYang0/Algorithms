package code;

import java.util.Arrays;

public class OneZero {
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1};
		int ans = findOne(nums);
		System.out.println(ans);
	}

	public static int findOne(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
	    int[] ones = new int[nums.length];
	    if (nums[0] == 0) {
	    	ones[0] = 0;
	    } else {
	    	ones[0] = 1;
	    }
	    for (int i = 1; i < nums.length; i++) {
	    	if (nums[i] == 0) {
	    		ones[i] = 0;
	    	} else if (nums[i] == 1 && nums[i - 1] != 0) {
	    		ones[i] = ones[i - 1] + 1;
	    	} else {
	    		ones[i] = 1;
	    	}
	    }
	    int ans = 0;
	    for (int i = 0; i < nums.length; i++) {
	    	if (nums[i] == 0 && i != 0) {
	    		int temp = ones[i - 1];
	    		while (i + 1 < nums.length && ones[i + 1] != 0) {
	    			i++;
	    		}
	    		temp += ones[i];
	    		if (temp > ans) {
	    			ans = temp;
	    		}
	    	}
	    	if (ones[i] > ans) {
	    		ans = ones[i];
	    	}
	    }
		return ans;
	}
}
