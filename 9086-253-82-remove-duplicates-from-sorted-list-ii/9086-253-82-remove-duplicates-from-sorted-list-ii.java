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
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(!list1.contains(temp.val))
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
        for(int i=0;i<list1.size();i++)
        {
            if(!list2.contains(list1.get(i)))
            {
                ListNode newnode=new ListNode(list1.get(i),null);
                tail.next=newnode;
                tail=newnode;
            }
        }
        return dummy.next;
    }
}