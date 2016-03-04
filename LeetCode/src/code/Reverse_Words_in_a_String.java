package code;

import java.util.Arrays;

public class Reverse_Words_in_a_String {
	
	public static void main(String[] args) {
		String s = "  1";
		String ans = reverseWords(s);
	}

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String[] strs = s.split(" ");
        System.out.println(Arrays.toString(strs));
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
  //          if (!strs[i].equals("")) {
            sb.append(strs[i]);
            sb.append(" ");
  //          }
        }

        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
