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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<Double> result=new ArrayList<>(); 
        if(root==null)
        {
           return result;
        }
        que.offer(root);
        while(!que.isEmpty())
        {
            int n=que.size();
            double avg=0;
            for(int i=0;i<n;i++)
            {
                TreeNode node=que.poll();
                avg=avg+node.val;
                if(node.left!=null)
                {
                    que.offer(node.left);
                }
                if(node.right!=null)
                {
                    que.offer(node.right);
                }
            }
            result.add(avg/n);
        }
        return result;
    }
}