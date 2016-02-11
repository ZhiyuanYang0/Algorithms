package LeetCode;

public class leetcode92 {

	public static void main(String[] args) {

	}


	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode p1 = head;
		for (int i = 1; i < m; i++) {
			p1 = p1.next;
		}
		ListNode p2 = head.next;
		for (int i = 0; i < n - m; i++) {
			ListNode t = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = t;
		}
		return head;
	}
}
