class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node
        slow.next = slow.next.next;

        return dummy.next;
    }
}