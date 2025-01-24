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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                list1.add(temp.val);
            }
            else
            {
                list2.add(temp.val);
            }
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0,null);
        ListNode tail=dummy;
        for(int i=0;i<list2.size();i++)
        {
            list1.add(list2.get(i));
        }
        for(int i=0;i<list1.size();i++)
        {
            ListNode newnode=new ListNode(list1.get(i));
            tail.next=newnode;
            tail=newnode;
        }
        return dummy.next;
    }
}