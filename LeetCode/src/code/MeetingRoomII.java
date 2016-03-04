package code;

import java.util.PriorityQueue;

public class MeetingRoomII {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(3);
		queue.offer(5);
		queue.offer(9);
		queue.offer(1);
		queue.offer(2);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
