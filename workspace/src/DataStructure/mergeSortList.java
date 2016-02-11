package DataStructure;

import LeetCode.ListNode;

public class mergeSortList {

	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode mid = getMiddleNode(head);
		ListNode next = mid.next;
		mid.next = null;
		return mergeSort(head, next);    
	}
	
	public static ListNode getMiddleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static ListNode mergeSort(ListNode head, ListNode mid) {
		ListNode dummy = new ListNode(-1);
		ListNode left = head;
		ListNode right = mid;
		while (left != null || right != null) {
			if (left.val <= right.val) {
				dummy.next = left;
				dummy = dummy.next;
				left = left.next;
			} else {
				dummy.next = right;
				dummy = dummy.next;
				right = right.next;
			}
		}
		
		while (left != null) {
			dummy.next = left;
			dummy = dummy.next;
			left = left.next;
		}
		while (right != null) {
			dummy.next = right;
			dummy = dummy.next;
			right = right.next;
		}
		
		return dummy.next;
	}
	
}
