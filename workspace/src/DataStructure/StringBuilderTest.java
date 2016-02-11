package DataStructure;

import java.util.Arrays;

public class StringBuilderTest {

	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();  
		sb.append("Hello");
		String s = sb.toString();
		System.out.println(sb);
		System.out.println(s);
		sb.append(s);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		s += s;
		String[] t1 = s.split("e");
		System.out.println(s);
		System.out.println(Arrays.toString(t1));
		
		
	}
}
