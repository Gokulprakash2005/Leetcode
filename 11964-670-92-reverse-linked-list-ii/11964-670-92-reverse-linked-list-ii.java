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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy =new ListNode (0,null);
        dummy.next=head;
        ListNode temp=dummy;
        for(int i=1;i<left;i++)
        {
           temp=temp.next;
        }
        ListNode prev=null;
        ListNode current=temp.next;
        ListNode nexts=current.next;
        for(int i=0;i<((right-left)+1);i++)
        {
          current.next=prev;
          prev=current;
          current=nexts;
          if(nexts!=null)
          {
            nexts=nexts.next;
          }
        }
        temp.next.next=current;
        temp.next=prev;
        return dummy.next;
    }
}