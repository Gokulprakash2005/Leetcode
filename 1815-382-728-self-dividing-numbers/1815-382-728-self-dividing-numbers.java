class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list1=new ArrayList<>();
        while(left<=right)
        {
            boolean ans=sdn(left);
            if(ans)
            {
                list1.add(left);
            }
            left++;
        }
        return list1;
    }
    public boolean sdn(int num)
    {
      int temp=num;
      while(temp>0)
      {
        int digit=temp%10;
        if(digit ==0 || num % digit !=0)
        {
            return false;
        }
        temp=temp/10;
      }
      return true;
    }
}