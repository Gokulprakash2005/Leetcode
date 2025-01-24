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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int array[]=new int[count];
        for(int i=0;i<count;i++)
        {
            array[i]=temp1.val;
            temp1=temp1.next;
        }
        for(int i=1;i<array.length;i++)
        {
            for(int j=i;j>0;j--)
            {
              if(array[j]<array[j-1])
              {
                int temp5=array[j];
                array[j]=array[j-1];
                array[j-1]=temp5;
              }
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        for(int i=0;i<array.length;i++)
        {
            ListNode newnode=new ListNode(array[i],null);
            tail.next=newnode;
            tail=newnode;
        }
        return dummy.next;
    }
}