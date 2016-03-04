package code;

public class RotateList {
	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		first.next = second;
		ListNode ans = rotateRight(first, 1);
		System.out.println(ans.val);
		System.out.println(ans.next.val);
	}
	
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = listLength(head);
        k = k % length;
        if (k == 0) {
        	return head;
        }
        ListNode start = head;
        ListNode middle = head;
        for (int i = 0; i < length - k - 1; i++) {
            middle = middle.next;
        }
        ListNode temp = middle.next;
        middle.next = null;
        middle = temp;
        while (middle.next != null) {
            middle = middle.next;
        }
        middle.next = start;
        return middle;
    }

    
    private static int listLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
