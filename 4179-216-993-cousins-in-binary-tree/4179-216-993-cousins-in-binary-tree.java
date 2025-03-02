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
        int xheight=0;
        int yheight=0;
        TreeNode xparent=null;
        TreeNode yparent=null;
    public boolean isCousins(TreeNode root, int x, int y) {
      check(root,x,y,0,null);
      if(xheight==yheight && xparent!=yparent)
      {
        return true;
      }
        return false;
    }
    public  void check(TreeNode node,int x,int y,int height,TreeNode parent)
    {
          if(node==null)
          {
            return ;
          }
          if(node.val==x)
          {
            xheight=height;
            xparent=parent;
          }
           if(node.val==y)
          {
            yheight=height;
            yparent=parent;
          }
          check(node.left,x,y,height+1,node);
          check(node.right,x,y,height+1,node);
    }
}