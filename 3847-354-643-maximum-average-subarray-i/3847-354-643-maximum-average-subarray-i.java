class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0,count=0,sum=0;
        double max=Double.NEGATIVE_INFINITY;
        while(r<nums.length)
        {
           count++;
           sum+=nums[r];
           if(count==k)
           {
              double ans=(double) sum/k;
              max=Math.max(max,ans);
              sum=sum-nums[l];
              count--;
              l++;
           }
           r++;
        }
        return max;
    }
}