/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow =head;
        ListNode temp;
        int length=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                temp=slow;
                do{
                  temp=temp.next;
                  length++;
                } while(temp!=slow) ;
                return fristnode(length,head);              
            }
        }
        return null;
    }
    public ListNode fristnode(int length,ListNode head)
    {
        ListNode start =head;
        ListNode end=head;
        while(length>0)
        {
            start=start.next;
            length--;
        }
        while(start!=end)
        {
             start=start.next;
             end=end.next;
        }
        return start;
    }
}