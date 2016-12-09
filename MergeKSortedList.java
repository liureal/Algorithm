import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {
	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		if (lists.length == 1) {
			return lists[0];
		}
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode node1, ListNode node2) {
				return node1.val - node2.val;
			}
		});
		for (ListNode node : lists) {
			if (node != null) {
				queue.add(node);
			}
		}
		ListNode result = null;
		ListNode pointer = null;
		while (queue.size() > 1) {
			ListNode pollNode = queue.poll();
			if (pollNode.next != null) {
				queue.add(pollNode.next);
			}
			if (result == null) {
				result = pollNode;
				pointer = pollNode;
			}else {
				pointer.next = pollNode;
				pointer = pointer.next;
			}
			
		}
		if (queue.size() == 1) {
			if (result == null) {
				result = queue.poll();
			}else {
				pointer.next = queue.poll();
			}
		}
		return result;
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
