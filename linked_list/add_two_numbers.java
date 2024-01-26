class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        int c = 0, sum;
        while (l1 != null && l2 != null) {
            sum = c + l1.val + l2.val;
            ListNode node = new ListNode(sum%10);
            c = sum/10;
            current.next = node;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = c + l1.val;
            ListNode node = new ListNode(sum%10);
            c = sum/10;
            current.next = node;
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = c + l2.val;
            ListNode node = new ListNode(sum%10);
            c = sum/10;
            current.next = node;
            current = current.next;
            l2 = l2.next;
        }
        if (c == 1) {
            ListNode node = new ListNode(1);
            current.next = node;
        }
        return ans.next;
    }
}
