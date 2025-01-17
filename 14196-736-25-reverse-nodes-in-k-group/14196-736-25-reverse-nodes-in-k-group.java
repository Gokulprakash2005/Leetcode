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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k<2)
        {
            return head;
        }
        ListNode dummy = new ListNode(0,null);
        dummy.next=head;
        ListNode temp=dummy;
        ListNode prevgrp = dummy;
        int count=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        while(count>=k)
        {
          ListNode prev=null;
          ListNode current=prevgrp.next;
          ListNode tail=current;
          ListNode nexts=current.next;

          for(int i=0;i<k;i++)
          {
            current.next=prev;
            prev=current;
            current=nexts;
            if(nexts!=null)
            {
                nexts=nexts.next;
            }
          }

          prevgrp.next=prev;
          tail.next=current;
          prevgrp=tail;
          count=count-k;
        }
        return dummy.next;
    }
}