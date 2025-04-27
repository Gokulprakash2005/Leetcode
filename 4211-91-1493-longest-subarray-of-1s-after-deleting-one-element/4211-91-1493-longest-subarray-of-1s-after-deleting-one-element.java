class Solution {
    public int longestSubarray(int[] nums) {
       int l=0,r=0,maxlen=0;
       HashMap<Integer,Integer> maps=new HashMap<>();
       while(r<nums.length)
       {
        maps.put(nums[r],maps.getOrDefault(nums[r],0)+1);
        while (maps.getOrDefault(0, 0) > 1)
        {
            maps.put(nums[l],maps.get(nums[l])-1);
            l++;
        }
        maxlen=Math.max(maxlen,r-l+1);
        r++;
       } 
       return maxlen-1;
    }
}