package code;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "cba";
		int ans = palindrome(str);
		System.out.println(ans);
 	}

	public static int palindrome(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < str.length() - 1; i++) {
			helper(set, str, i, i);
			if (str.charAt(i) == str.charAt(i + 1)) {
				helper(set, str, i, i + 1);
			}
		}
		set.add(str.substring(str.length() - 1, str.length()));
		return set.size();
	}
	
	public static void helper(Set<String> set, String str, int left, int right) {
		while(left >= 0 && right < str.length()) {
			if (str.charAt(left) == str.charAt(right)) {
				set.add(str.substring(left, right + 1));
			} else {
				break;
			}
			left--;
			right++;
		}
	}
}
