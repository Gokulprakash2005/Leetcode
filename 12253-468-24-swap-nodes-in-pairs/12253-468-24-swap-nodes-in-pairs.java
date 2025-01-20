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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
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
        while(count>=2)
        {
          ListNode prev=null;
          ListNode current=prevgrp.next;
          ListNode tail=current;
          ListNode nexts=current.next;

          for(int i=0;i<2;i++)
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
          count=count-2;
        }
        return dummy.next;
    }
}