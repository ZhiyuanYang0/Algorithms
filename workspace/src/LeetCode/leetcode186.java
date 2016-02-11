package LeetCode;

import java.util.Arrays;

public class leetcode186 {
  
	public static void main(String args[]) {
		char[] s = {'s','a','m','\t','s','\t', '4'};
		char[] s1 = {'a','\t', 'b'};
		reverseWords(s);
//		rotate(s, 1, 1);
		System.out.println(Arrays.toString(s));
	}
    public static void reverseWords(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int low = 0;
        int hi = 0;
        while (hi < s.length) {
            if (s[hi] == '\t') {
                rotate(s, low, hi - 1);
                low = hi + 1;
                hi = hi + 1;
            } else {
                hi++;
            }
        }
        rotate(s, low, hi - 1);
        rotate(s, 0, s.length - 1);
        return;
        
    }
    
    private static void rotate(char[] s, int low, int hi) {
       while (low < hi) {
           char temp = s[low];
           s[low] = s[hi];
           s[hi] = temp;
           low++;
           hi--;
       }
    }
}
