class SortList {
    public ListNode sortList(ListNode head) {
        return sort(head);
    }
    
    public ListNode sort(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new ListNode(head.val);
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode mid = null;
        
        while (fast != null && fast.next != null) {
            mid = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        mid.next = null;

        ListNode left = sort(head);
        ListNode right = sort(slow);
        return merge(left,right);
    }
    
    public ListNode merge (ListNode left,ListNode right) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (left != null && right != null) {
            if (left.val < right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        if (right != null)
            cur.next = right;
        if (left != null)
            cur.next = left;
        return head.next;
    }
}