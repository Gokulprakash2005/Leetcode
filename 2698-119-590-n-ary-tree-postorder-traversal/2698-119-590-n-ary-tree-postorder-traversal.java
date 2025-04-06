
class Solution {
    List<Integer> list1=new ArrayList<>();
    public List<Integer> postorder(Node root) {

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
        
        for(Node obj:root.children)
        {
            call(obj);
        }
          list1.add(root.val);
    }
}
