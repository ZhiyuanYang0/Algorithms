package test;

import java.util.ArrayList;
import java.util.List;

import LeetCode.ListNode;

public class test1 {

	public static void main(String args[]) {
		
		String s1 = "HelloWorld";
		System.out.print(s1);
		System.out.println(s1.substring(5,10));
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.size();
		
		Boolean[] happy = new Boolean[3];
		System.out.println(happy[1]);
		
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		int index = 0;
		System.out.println(array.get(0));
		System.out.println(array.get(index++));
		System.out.println(array.get(index));
		
		index = 0;
		System.out.println(array.get(++index));
		
		System.out.println("...................");
		
		ListNode dummy = new ListNode(0);
		ListNode n1 = new ListNode(1);
		dummy.next = n1;
		ListNode t = dummy;
		t = dummy.next;
		t.val = 3;
		System.out.println(dummy.val);
		System.out.println(t.val);
		
		Integer t2 = 3;
		System.out.println(t2);
		test(t2);
		System.out.println(t2);
		
		List<Integer> s = new ArrayList<Integer>();
	    s.add(3);
	    System.out.println(s);
	    test2(s);
	    System.out.println(s);
	    
	}
	
	private static void test(Integer t) {
		t = 4;
	}
	
	private static void test2(List<Integer> t) {
	    t.set(0, 1);
		t.add(5);
	}
}
