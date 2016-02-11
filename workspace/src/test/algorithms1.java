package test;

import java.util.ArrayList;
import java.util.List;

public class algorithms1 {
	
	public static void main(String[] args) {
		System.out.println(Fibonacci2(10));
	}

	// O(2^n)
	public static int Fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
	
	// O(n)
	public static int Fibonacci2(int n) {
		List<Integer> array = new ArrayList<Integer>();
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		array.add(0);
		array.add(1);
		for (int i = 2; i <= n; i++) {
			array.add(array.get(i - 1) + array.get(i - 2));
		}
		return array.get(n);
	}
}
