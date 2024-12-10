class Solution {
    public int maximumWealth(int[][] accounts) {
        return max(accounts);
    }
    
    public int max(int arr1[][])
    {
        int answer=Integer.MIN_VALUE;
        for(int arrone[]:arr1)
        {
            int sum=0;
            for(int i:arrone)
            {
                sum=sum+i;
            }
            if(answer<sum)
            {
                answer=sum;
            }
        }
        return answer;
    }
    
}