public class SwapNodePairs {
	public static ListNode swapPairs(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode result = null;
		ListNode pointer = null;
		while (head != null && head.next != null) {
			ListNode left = head;
			ListNode right = head.next;
			// swap
			if (right.next != null) {
				left.next = right.next;
			}else {
				left.next = null;
			}
			right.next = left;
			if (result == null) {
				result = right;
			} else {
				pointer.next = right;
			}
			pointer = left;
			head = pointer.next;
		}
        return result;
    }
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
}
