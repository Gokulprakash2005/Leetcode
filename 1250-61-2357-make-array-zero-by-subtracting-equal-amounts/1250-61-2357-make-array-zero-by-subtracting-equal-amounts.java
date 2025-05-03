class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> maps=new HashSet<>();
        for(int i:nums)
        {
            if(i!=0)
            {
                maps.add(i);
            }
        }
        return maps.size();
    }
}