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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
              return head;
        }
        ListNode dummy=new ListNode(0,null);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode current=prev.next;
        while(current!=null)
        {
            if(current.val==val)
            {
             prev.next=current.next;
             current=current.next;
            }
            else
            {
                prev=current;
                current=current.next;
            }
        }
        return dummy.next;
    }
}