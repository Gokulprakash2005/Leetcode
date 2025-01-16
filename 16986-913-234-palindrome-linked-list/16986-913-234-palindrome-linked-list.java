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
    public boolean isPalindrome(ListNode head) {
        ListNode middle=getMid(head);
        ListNode reversed =rev(middle);
        ListNode temp=reversed;
        while(head!=null && reversed!=null)
        {
            if(head.val != reversed.val)
            {
                break;
            }
                head=head.next;
                reversed=reversed.next;
        }
        rev(temp);
        if(head == null || reversed == null)
        {
            return true;
        }
        return false;
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