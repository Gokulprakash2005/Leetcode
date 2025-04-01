class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]<10)
          {
            sum=sum+nums[i];
          }
          else
          {
            sum=sum+call(nums[i]);
          }
        }
        return sum;
    }
    public int call(int num)
    {
        int max=0;
        int count=0;
        while(num>0)
        {
           if(num%10>max)
           {
            max=num%10;
           }
           num=num/10;
            count++;
           
        }
        if(count==2)
        {
            return max*11;
        }
        if(count==3)
        {
            return max*111;
        }
        return max*1111;
    }
}