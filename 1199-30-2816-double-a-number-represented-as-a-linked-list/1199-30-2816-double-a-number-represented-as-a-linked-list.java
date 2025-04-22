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
    public ListNode doubleIt(ListNode head) {
        head=rev(head);
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        int carry=0;
        while(head!=null)
        {
            int val=head.val*2+carry;
            ListNode newnode=new ListNode(val%10);
            current.next=newnode;
            current=current.next;
            carry=val/10;
            head=head.next;
        }
        if(carry>0)
        {
            ListNode newone=new ListNode(carry);
            current.next=newone;
            current=current.next;
        }
        return rev(dummy.next);
        
    }
    public ListNode rev(ListNode head) 
    {
        ListNode prev =null;
        ListNode current =head;
        ListNode other =head.next;
        while(current !=null)
        {
            current.next=prev;
            prev=current;
            current=other;
            if(other!=null)
            {
                other=other.next;
            }
        }
        return prev;
    }
}