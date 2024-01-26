class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int nFromFront = numberOfNodes(head) - n + 1, current = 1;
        if (nFromFront == 1) {
            return head.next;
        }
        while (current < nFromFront - 1) {
            current++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public int numberOfNodes(ListNode head) {
        int numberOfNodes = 0;
        while (head != null) {
            numberOfNodes++;
            head = head.next;
        }
        return numberOfNodes;
    }
}
