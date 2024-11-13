class Solution {
    public boolean canJump(int[] nums) {
        int stepcount=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            stepcount--;
             if(stepcount<0)
            {
                return false;
            }
            if(i==nums.length-1)
            {
                return true;
            }
            if(stepcount<nums[i])
            {
                stepcount=nums[i];
            }

           
        }
        return true;
    }
}