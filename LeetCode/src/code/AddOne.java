package code;

import java.util.Arrays;

public class AddOne {
	public static void main(String[] args) {
		int[] nums = {9};
		int[] ans = plusOne(nums);
		System.out.println(Arrays.toString(ans));
	}

    public static int[] plusOne(int[] digits) {
        boolean flag = true;
        int length = digits.length;
        int index = length - 1;
        while (index >= 0 && flag == true) {
        	System.out.println(index);
            if (digits[index] + 1 > 9) {
                digits[index] = 0;
                index--;
            } else {
                digits[index] += 1;
                flag = false;
            }
        }
        System.out.println(flag);
        if (flag == true) {
            int[] ans = new int[length + 1];
            ans[0] = 1;
            for (int i = 1; i <= length; i++) {
                ans[i] = digits[i - 1];
            }
            return ans;
        }
        System.out.println(Arrays.toString(digits));
        return digits;
     }
}
