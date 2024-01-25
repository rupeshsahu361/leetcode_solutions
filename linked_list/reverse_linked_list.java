class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp, ans = null;
        while (head != null) {
            temp = head.next;
            head.next = ans;
            ans = head;
            head = temp;
        }
        return ans;
    }
}
