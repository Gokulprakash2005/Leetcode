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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0,carry=0;
        ListNode list1=reverse(l1);
        ListNode list2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(list1!=null || list2!=null || carry!=0)
        {
           sum=carry;
           if(list1!=null)
           {
           sum=sum+list1.val;
           list1=list1.next;
           }
           if(list2!=null)
           {
           sum=sum+list2.val;
           list2=list2.next;
           }
            carry=sum/10;
             tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }
         return reverse(dummy.next);
    }
       
        public ListNode reverse(ListNode head)
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