class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> sub =new ArrayList<>();
         List<Integer> list1=new ArrayList<>();
         subsequneces(0,nums,sub,list1);
         return sub;
    }
      void subsequneces(int i,int nums[],List<List<Integer>> sub,List<Integer> list1)
    {
        if(i>=nums.length)
        {
            sub.add(new ArrayList<>(list1));
            return ;
        }
        list1.add(nums[i]);
         subsequneces(i+1,nums,sub,list1);
        list1.remove(list1.size()-1);
         subsequneces(i+1,nums,sub,list1);
    }
}