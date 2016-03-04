package code;

public class oddEvenList {
	public static void main(String[] args) {
		ListNode[] nodes = new ListNode[3];
		for (int i = 0; i < 3; i++) {
			nodes[i] = new ListNode(i + 1);
		}
		for (int i = 0; i < 2; i++) {
			nodes[i].next = nodes[i + 1];
		}
		
        ListNode ans = oddEven(nodes[0]);
        while (ans != null) {
        	System.out.println(ans.val);
        	ans = ans.next;
        }
	}

	public static ListNode oddEven(ListNode head) {
		ListNode dummy = new ListNode(-1);
		ListNode dummy2 = new ListNode(-1);
		ListNode odd = dummy;
		ListNode even = dummy2;
		ListNode cur = head;
		boolean flag = true;
		while (cur != null) {
			if (flag == true) {
				odd.next = cur;
				odd = cur;
				flag = false;
			} else {
				even.next = cur;
				even = cur;
				flag = true;
			}
			cur = cur.next;
		}
		even.next = null;
		odd.next = dummy2.next;
		return dummy.next;
	}
}