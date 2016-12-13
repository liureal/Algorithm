public class ReverseKGroup {
	
	public static ListNode reverseKGroup(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		if (head.next == null || k == 1) {
			return head;
		}
		ListNode[] nodeArray = new ListNode[k];
		ListNode result = null;
		ListNode pointer = null;
		ListNode next = null;
		boolean isOver = false;
		while (true) {
			if (head == null) {
				break;
			}
			for (int i = 0; i < k; i++) {
				if (head.next == null) {
					isOver = true;
					break;
				}
				if (i == 0) {
					nodeArray[0] = head;
				}else {
					nodeArray[i] = head.next;
					head = head.next;
				}
			}
			if (isOver) {
				break;
			}
			next = nodeArray[k-1].next;
			for (int i = k-1; i > 0; i--) {
				nodeArray[i].next = nodeArray[i-1];
			}
			if (result == null) {
				result = nodeArray[k-1];
			}else {
				pointer.next = nodeArray[k-1];
			}
			pointer = nodeArray[0];
			nodeArray[0].next = next;
			head = next;
		}
		if (result == null) {
			result = nodeArray[0];
		}
        return result;
    }

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
