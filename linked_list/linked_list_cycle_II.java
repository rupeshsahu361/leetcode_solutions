public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head.next, fast = head.next.next, slow2;
        while (fast != null && fast.next != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != fast) {
            return null;
        }
        slow2 = head;
        while (slow != slow2) {
            slow = slow.next;
            slow2 = slow2.next;
        }
        return slow;
    }
}
