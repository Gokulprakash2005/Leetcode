class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> maps=new HashSet<>();
        for(int i:nums)
        {
            if(!maps.contains(i))
            {
                maps.add(i);
            }
            else
            {
                return i;
            }
        }
        return -1;
    }
}