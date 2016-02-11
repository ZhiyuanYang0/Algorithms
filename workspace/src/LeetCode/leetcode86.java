package LeetCode;

public class leetcode86 {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		ListNode l2 = new ListNode(1);
		head.next = l2;
		ListNode t = partition(head,3);
		while (t != null) {
			System.out.println(t.val);
			t = t.next;
		}

	}

	public static ListNode partition(ListNode head, int x) {
		if (head == null) {
			return head;
		}
		ListNode dummyNode = new ListNode(0);
		ListNode minList = dummyNode;
		ListNode dummyNode2 = new ListNode(0);
		ListNode maxList = dummyNode2;
		ListNode now = head;
		while (now != null) {
			if (now.val < x) {
				minList.next = now;
				minList = minList.next;
			} else {
				maxList.next = now;
				maxList = maxList.next;
			}
			now = now.next;
		}
		minList.next = dummyNode2.next;
		if (maxList != null) {
			maxList.next = null;
		}
		return dummyNode.next;
	}

}
