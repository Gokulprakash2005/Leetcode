class Solution {
    public int sumCounts(List<Integer> nums) {
        int val=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                val+=call(i,j,nums);
            }
        }
        return val;
    }
    public int call(int startind,int endind,List<Integer> nums)
    {
        Set<Integer> sets=new HashSet<>();
        for(int i=startind;i<=endind;i++)
        {
          sets.add(nums.get(i));
        }
        return sets.size()*sets.size();
    }
}