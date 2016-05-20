public class RemoveNodeFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int count = 0;
		for (ListNode node = head; node != null; node = node.next) {
			count++;
		}
		int target = count - n;
		ListNode prevNode = null;
		if (target == 0) {
			return head.next;
		}
		for (ListNode node = head; node != null; node = node.next) {
			if (target == 1) {
				prevNode = node;
			}
			if (target == 0) {
				prevNode.next = node.next;
				node = null;
				return head;
			}
			target--;
		}
		return null;
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
