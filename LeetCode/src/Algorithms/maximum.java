package Algorithms;

public class maximum {

	

public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int minPre = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        max = Math.max(max, sum - minPre);
        minPre = Math.min(sum, minPre);
    }
    return max;
}

}
