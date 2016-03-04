package hard;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    
	Map<Integer, DListNode> map;
	DListNode head, tail;
	int capacity;

	public LRUCache(int capacity) {
		map = new HashMap<Integer, DListNode>();
		head = new DListNode(-1, -1);
		tail = new DListNode(-1, -1);
		head.next = tail;
		tail.prev = head;
		this.capacity = capacity;
	}

	public int get(int key) {
		if (!map.containsKey(key)) {
		    return -1;
		} else {
			DListNode temp = map.get(key);
			removeNode(temp);
			setHead(temp);
		    return temp.value;
		}
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			DListNode temp = map.get(key);
			temp.value = value;
			removeNode(temp);
			setHead(temp);	
			return;
		}
		
		if (map.size() >= capacity) {
			map.remove(tail.prev.key);
			removeNode(tail.prev);
		}
		
		DListNode created = new DListNode(key, value);
		map.put(key, created);
		setHead(created);

	}

	public void removeNode(DListNode node) {
		DListNode temp = node.next;
		node.prev.next = temp;
		temp.prev = node.prev;

	}

	public void setHead(DListNode node) {
		DListNode temp = head.next;
		head.next = node;
		node.next = temp;
		temp.prev = node;
		node.prev = head;
	}
}