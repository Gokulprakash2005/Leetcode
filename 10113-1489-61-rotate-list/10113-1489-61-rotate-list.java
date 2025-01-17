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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<1)
        {
            return head;
        }
        ListNode temp =head;
        int count=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        int ktimes=k % count;
        int ans=count-ktimes;
        ListNode iter=head;
        if(ans == 0)
        {
            return head;
        }
        for(int i=0 ;i<ans-1 ;i++)
        {
            iter=iter.next;
        }
        temp.next=head;
        head=iter.next;
        iter.next=null;
        return head;
    }
}