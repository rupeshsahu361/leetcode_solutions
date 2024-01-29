class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode mid = reverseList(middleNode(head));
        while (mid != null) {
            if (mid.val != head.val) {
                return false;
            }
            mid = mid.next;
            head = head.next;
        }
        return true;
    }
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
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode slow = head.next, fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast == null ? slow : slow.next;
    }
}
