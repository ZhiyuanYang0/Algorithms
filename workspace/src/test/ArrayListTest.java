package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
 
	public static void main(String args[]) {
		List<List<Integer>> rst = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		rst.add(list);
		list.add(2);
		rst.add(list);
		for (List<Integer> n : rst) {
			System.out.println(n);
		}		
		
		int[] nums1 = new int[2];
	    System.out.println(nums1.length);
		
	}
}
