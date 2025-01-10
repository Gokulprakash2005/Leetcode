class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);
        if(fast == 1)
        {
          return true;
        }
        return false;
    }
    public int square(int n)
    {
       int ans,ans1=0;
        while(n>0)
        {
           ans=n % 10;
           ans1=ans1+(ans*ans);
           n=n/10;
        }
        return ans1;
    }
}