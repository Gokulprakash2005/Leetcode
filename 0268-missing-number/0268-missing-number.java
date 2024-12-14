class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int sum=(n*(n+1))/2;
      int dup=0;
      for(int i:nums)
      {
        dup=dup+i;
      }
      return sum-dup;
    }
}