public class MergeTowSortedList {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode result = null;
		ListNode point = null;
		while (true) {
			if (result == null) {
				if (l1.val < l2.val) {
					result = l1;
					l1 = l1.next;
				}else {
					result = l2;
					l2 = l2.next;
				}
				point = result;
				continue;
			} 
			if (l1 == null) {
				point.next = l2;
				break;
			}
			if (l2 == null) {
				point.next = l1;
				break;
			}
			if (l1.val < l2.val) {
				point.next = l1;
				l1 = l1.next;
			}else {
				point.next = l2;
				l2 = l2.next;
			}
			point = point.next;
		}
        return result;
    }
	
	
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
		
	}
}
