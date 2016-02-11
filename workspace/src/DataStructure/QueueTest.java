package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
  
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(4);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.peek());
		
		String s1 = "Hello World";
		String s2 = "";
		s2 += "Hello World";
		boolean b1;
		boolean b2;
		b1 = (s1 == s2);
		b2 = (s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(b1);
		System.out.println(b2);
		
		
	}
}
