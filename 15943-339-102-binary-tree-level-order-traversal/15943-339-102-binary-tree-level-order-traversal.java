/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1=new ArrayList<>();
        if(root==null)
        {
            return list1;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
             int n=que.size();
             List<Integer> inner=new ArrayList<>();
             for(int i=0;i<n;i++)
             {
                 TreeNode temp=que.poll();
                 inner.add(temp.val);
                 if(temp.left!=null)
                 {
                    que.offer(temp.left);
                 }
                 if(temp.right!=null)
                 {
                    que.offer(temp.right);
                 }
             }
           list1.add(inner);  
        }
        return list1;
    }
}