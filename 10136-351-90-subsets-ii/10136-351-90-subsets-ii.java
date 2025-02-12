class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          {
            Arrays.sort(nums);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
     for(int j:nums)
     {
         int size=outer.size();
         for(int i=0;i<size;i++)
         {
             List<Integer> inner=new ArrayList<>(outer.get(i));
             inner.add(j);
             if(!outer.contains(inner))
             {
             outer.add(inner);
             }
         }
     }
     return outer;
     }
    }
}