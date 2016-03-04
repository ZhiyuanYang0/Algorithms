package hard;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    static PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
    static PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2 - o1;
		}
    	
    });
    
    public static void main(String[] args) {
    	addNum(12);
    	for(Integer n : min_heap) {
    		System.out.println("min_heap = " + n);
    	}
    	for(Integer n : max_heap) {
    		System.out.println("max_heap = " + n);
    	}
    	System.out.println(findMedian());
    	addNum(10);
    	for(Integer n : min_heap) {
    		System.out.println("min_heap = " + n);
    	}
    	for(Integer n : max_heap) {
    		System.out.println("max_heap = " + n);
    	}
    	System.out.println(findMedian());
    	addNum(13);
    	for(Integer n : min_heap) {
    		System.out.println("min_heap = " + n);
    	}
    	for(Integer n : max_heap) {
    		System.out.println("max_heap = " + n);
    	}
    	System.out.println(findMedian());
    	addNum(11);
    	for(Integer n : min_heap) {
    		System.out.println("min_heap = " + n);
    	}
    	for(Integer n : max_heap) {
    		System.out.println("max_heap = " + n);
    	}
    	System.out.println(findMedian());
    	addNum(5);
    	for(Integer n : min_heap) {
    		System.out.println("min_heap = " + n);
    	}
    	for(Integer n : max_heap) {
    		System.out.println("max_heap = " + n);
    	}
    	System.out.println(findMedian());
    	
    	for(Integer n : min_heap) {
    		System.out.println("min_heap = " + n);
    	}
    	for(Integer n : max_heap) {
    		System.out.println("max_heap = " + n);
    	}

	}

    // Adds a number into the data structure.
    public static void addNum(int num) {
    	if (max_heap.size() == 0 || num <= max_heap.peek()) {
                	
            if (min_heap.size() < max_heap.size()) {
                min_heap.offer(max_heap.poll());
            }
        	max_heap.offer(num);

    	} else {
          	    
    		if (max_heap.size() < min_heap.size()) {
    		    max_heap.offer(min_heap.poll());
          	}
    		min_heap.offer(num);

    	}
    }

    // Returns the median of current data stream
    public static double findMedian() {
   //     System.out.println("min = " + min_heap.peek() + " max = " + max_heap.peek());
    	if (max_heap.size() > min_heap.size()) {
    		return max_heap.peek();
    	} else if (min_heap.size() > max_heap.size()) {
    	    return min_heap.peek();
    	} else if (min_heap.size() == 0 && max_heap.size() == 0) {
    	    return 0;
    	} else {
    		return  (min_heap.peek() + max_heap.peek()) / 2.0;
    	}
    }

};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();