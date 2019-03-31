public class SortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);
        ListNode fast = head;
		ListNode slow = head;
		ListNode list = null;
		while(fast != null && fast.next != null) {
			list = slow;
			fast = fast.next.next;
			slow = slow.next;
		}

		TreeNode tree = new TreeNode(slow.val);
		list.next = null;
		tree.left = sortedListToBST(head);
		tree.right = sortedListToBST(slow.next);
		return tree;
    }
	}
}