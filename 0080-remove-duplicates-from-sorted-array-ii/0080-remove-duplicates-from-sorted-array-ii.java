class Solution {
    	    int j=0,i;
    	     int removeDuplicates(int[] nums) {
    	    	for(i=0;i<nums.length;i++)
    	    	{
    	    	   if(i<nums.length-2)
    	    	   {
    	    		if(nums[i]!=nums[i+1]||nums[i+1]!=nums[i+2])
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
    	    	for(i=0;i<j;i++)
    	    	{
    	    		System.out.print(nums[i]);
    	    	}
    	    	return j;
    	     }
    	}
