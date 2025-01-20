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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=null;
        ListNode duplicate=new ListNode(0,null);
        duplicate.next=head;
        if(head.next==null && n==0)
        {
            return head;
        }
        if(head.next==null && n==1)
        {
            return dummy;
        }
        ListNode temp=head;
        ListNode temp1=duplicate;
        ListNode prev=duplicate;
        int count=1,i=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        int res=count-n;
        while(res>=i)
        {
            prev=temp1;
            temp1=temp1.next;
            i++;
        }
        prev.next=temp1.next;
        return duplicate.next;
    }
}