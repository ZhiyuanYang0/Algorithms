package hard;

import java.util.HashMap;
import java.util.Map;

public class LRU2 {

	class ListNode {
		int key;
		int value;
		ListNode prev, next;

		public ListNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	Map<Integer, ListNode> map;
	ListNode head, tail;
	int capacity;

    public LRU2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, ListNode>();
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
        	return -1;
        } else {
        	ListNode temp = map.get(key);
        	deleteNode(temp);
        	setHead(temp);
        	return temp.value;
        }
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)) {
        	ListNode temp = map.get(key);
        	temp.value = value;
        	deleteNode(temp);
        	setHead(temp);
        	return;
        }
        
        while (map.size() >= capacity) {
        	map.remove(tail.prev.key);
        	deleteNode(tail.prev);
        }
        
        ListNode created = new ListNode(key, value);
        map.put(key, created);
        setHead(created);
    }
    
    public void deleteNode(ListNode node) {
    	node.next.prev = node.prev;
    	node.prev.next = node.next;
    }
    
    public void setHead(ListNode node) {
    	ListNode temp = head.next;
    	head.next = node;
    	node.next = temp;
    	temp.prev = node;
    	node.prev = head;
    }

}
