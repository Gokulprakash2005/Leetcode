class Solution {
    public int[] runningSum(int[] nums) {
       int arr[]=new int[nums.length];
       int count=0;
       for(int i=nums.length-1;i>=0;i--)
       {
        int sum=0;
        for(int j=i;j>=0;j--)
        {
          sum=sum+nums[j];
        }
        arr[count++]=sum;
       }
       int arr1[]=new int[arr.length];
       int cou=0;
       for(int i=arr.length-1;i>=0;i--)
       {
        arr1[cou++]=arr[i];
       }
       return arr1;
    }
}