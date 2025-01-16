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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next==null)
        {
            return ;
        }

        ListNode mid=getMid(head);
        ListNode end=rev(mid.next);
        mid.next=null;
        ListNode start=head;
        while(end!=null)
        {
            ListNode temp=start.next;
            start.next=end;
            start=temp;

            temp=end.next;
            end.next=start;
            end=temp;
        }
    }
         public ListNode getMid(ListNode head)
        {
         ListNode fast=head;
         ListNode slow=head;
         while(fast!=null && fast.next !=null)
         {
            fast=fast.next.next;
            slow=slow.next;
         }
         return slow;
        }

        public ListNode rev(ListNode middle)
       {
        ListNode prev=null;
        ListNode current=middle;
        ListNode nexts=current.next;
        while(current!=null)
        {
            current.next=prev;
            prev=current;
            current=nexts;
            if(nexts!=null)
            {
            nexts=nexts.next;
            }
        }
        return prev;
        }    
}