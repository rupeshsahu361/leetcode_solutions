public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = length(headA);
        int lengthB = length(headB);
        ListNode l = lengthA>=lengthB ? headA : headB;
        ListNode s = lengthB<=lengthA ? headB : headA;
        for (int i=0; i<Math.abs(lengthA-lengthB); i++) {
            l = l.next;
        }
        while (l!=null && s!=null && l!=s) {
            l = l.next;
            s = s.next;
        }
        return l==s ? l : null;
    }
    public int length(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
