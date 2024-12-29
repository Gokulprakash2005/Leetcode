class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0,end=0;
        for(int i:nums)
        {
            if(i>start)
            {
                start=i;
            }
            end=end+i;
        }
        return binarysearch(nums,k,start,end);  
    }
    public int binarysearch(int nums[],int k,int start,int end)
    {
        while(start<end)
        {
            int sum=0;
            int pices=1;
            int mid=(start+end)/2;
            for(int j:nums)
            {
                sum=sum+j;
                if(sum>mid)
                {
                   pices++;
                   sum=j;
                }
            }
            if(pices<=k)
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}