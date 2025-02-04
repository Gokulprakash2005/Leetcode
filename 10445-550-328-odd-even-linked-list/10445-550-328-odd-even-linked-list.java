/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }
         ListNode prev=head;
         ListNode current=head.next;
         ListNode temp=current;
         while(current!=null && current.next!=null)
         {
            prev.next=current.next;
            prev=current.next;
            current.next=prev.next;
            current=prev.next;
         }
         prev.next=temp;
         return head;
        
    }
}
