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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null)
        {
            return head;
        }
        ListNode mid = getmid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }

    public ListNode getmid(ListNode head)
    {
       ListNode midpre=null;
       while(head!=null && head.next!=null)
       {
          midpre=(midpre == null) ? head : midpre.next;
          head=head.next.next;
       }
       ListNode res=midpre.next;
       midpre.next=null;
       return  res;
    }

    public ListNode merge(ListNode head1,ListNode head2)
    {
       ListNode dummy=new ListNode(0,null);
       ListNode tail=dummy;
       while(head1!=null &&head2!=null)
       {
          if(head1.val < head2.val)
          {
               tail.next=head1;
               tail=head1;
               head1=head1.next;
          }
          else
          {
             tail.next=head2;
             tail=head2;
             head2=head2.next;
          }
       }
       if(head1 !=null)
       {
        while(head1 !=null)
        {
            tail.next=head1;
            tail=head1;
            head1=head1.next;
        }
       }
       else
       {
         while(head2 !=null)
        {
            tail.next=head2;
            tail=head2;
            head2=head2.next;
        }
       }
       return dummy.next;
    }

}