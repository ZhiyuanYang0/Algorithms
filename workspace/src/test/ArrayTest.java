package test;

import java.util.Arrays;

public class ArrayTest {

	
	static int a = 3;
	
	public static void main(String[] args) {
		int[] B = {1, 2};
		System.out.println(Arrays.toString(B));
		arrayTest(B);
		System.out.println(Arrays.toString(B));
	}
	
	private static void arrayTest(int[] A) {
		A[0] = 3;
		A[1] = 4;
	}
}
