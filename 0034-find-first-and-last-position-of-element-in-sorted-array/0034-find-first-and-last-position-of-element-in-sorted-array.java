class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=search(nums,target,true);
        arr[1]=search(nums,target,false);
        return arr;
    }
    public int search(int nums[],int target,boolean f1)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+(end-start)/2);
            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else{
                ans=mid;
                if(f1)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}