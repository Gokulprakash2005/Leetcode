class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer>maps=new HashMap<>();
        
        for(int i:nums)
        {
            if(maps.containsKey(i))
            {
                maps.put(i,maps.get(i)+1);
            }
            else
            {
                maps.put(i,1);
            }
        }
        for(int i:nums)
        {
         if (maps.get(i) % 2!= 0)
            {
                return false;
            }
        }
        return true;
    }
}