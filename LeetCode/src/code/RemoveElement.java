package code;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = {3, 3};
		int ans = 0;
		System.out.println(ans);
		ans = removeElement(nums, 5);
		System.out.println(ans);
	}
	
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            while (start < end && nums[end] == val) {
                end--;
            }
            if (nums[start] == val) {
                nums[start] = nums[end];
                start++;
                end--;
            }
            start++;
        }
        return end + 1;
    }
}
