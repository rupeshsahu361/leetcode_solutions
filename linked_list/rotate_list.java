class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = length(head);
        k = k%length;
        if (k == 0) {
            return head;
        }
        int leftLength = length-k;
        ListNode newTail = head;
        while (leftLength > 1) {
            newTail = newTail.next;
            leftLength--;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        ListNode lastNodeOfNewLeft = lastNode(newHead);
        lastNodeOfNewLeft.next = head;
        return newHead;
    }
    public int length(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    public ListNode lastNode(ListNode head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}
