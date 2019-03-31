class swapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode cur = node;
        while (cur.next != null && cur.next.next != null) {
            ListNode firstNode = cur.next;
            ListNode lastNode = firstNode.next;
            // 交换节点
            firstNode.next = lastNode.next;
            lastNode.next = firstNode;
            cur.next = lastNode;
            
            cur = cur.next.next;
        }
        return node.next;
    }
}