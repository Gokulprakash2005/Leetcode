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
    List<Integer> list1=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)
        {
            return list1;
        }
        call(root);
        return list1;
    }
    public void call(Node root)
    {
        if(root==null)
        {
            return;
        }
        list1.add(root.val);
        for(Node obj:root.children)
        {
            call(obj);
        }
    }
}