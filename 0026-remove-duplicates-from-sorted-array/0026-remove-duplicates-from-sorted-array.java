class Solution {
    int j=0,i;
    public int removeDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
          if(i<nums.length-1)
          {  
            if(nums[i]!=nums[i+1])
            {
               nums[j]=nums[i];
               j++; 
            }
          } 
         else
         {
             nums[j]=nums[i];
             j++;
         } 
        }
        return j;
    }
}