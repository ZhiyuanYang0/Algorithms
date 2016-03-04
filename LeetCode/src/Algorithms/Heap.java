package Algorithms;

import java.util.PriorityQueue;

public class Heap {
	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		heap.add(5);
		heap.add(3);
		heap.add(4);
		heap.add(6);
		heap.add(2);
		//priority queue is a min heap, which means the parent is equal or smaller than it's children
		System.out.println(heap.peek());
		
	}
}
