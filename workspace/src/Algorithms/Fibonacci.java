package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(fibonacci2(55));
	    double ans = pow(2, 6);
	    System.out.println(ans);
	}

	// O(2^n)
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	// O(n)
	public static int fibonacci2(int n) {
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
	
	/*  a0 = 0;
	 *  a1 = 1;
	 *  ai = ai-1 + ai-2; (n >= 2)
	 */
	
	// log(n) for pow function
	public static double pow(double x, int n) {
		if (n < 0) {
            return 1 / pow(x, -n);
        }
		
		if (n == 0) {
			return 1;
		}
		
		double half = pow(x, n / 2);
		
		if (n % 2 == 0) {
			return half * half;
		} else {
			return x * half * half;
		}	
	}
}

