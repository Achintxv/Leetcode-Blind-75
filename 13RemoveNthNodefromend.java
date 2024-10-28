/*Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum = new ListNode(-1);
        dum.next = head;
        ListNode left=dum; ListNode right=dum;
        for(int i=0; i<n; i++){
            right=right.next;
        }
        while(right.next!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;
        return dum.next;
    }
}
