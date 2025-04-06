/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) 
    {
    List<List<Integer>> list1=new ArrayList<>();
        if(root==null)
        {
            return list1;
        }
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
             int n=que.size();
             List<Integer> inner=new ArrayList<>();
             for(int i=0;i<n;i++)
             {
                 Node temp=que.poll();
                 inner.add(temp.val);
                for(Node obj:temp.children)
                 {
                    que.offer(obj);
                 }
             }
           list1.add(inner);  
        }
        return list1;
    }
}