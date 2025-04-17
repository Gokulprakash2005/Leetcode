class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        for(int i=0;i<k;i++)
        {
          max+=cardPoints[i];
        }
        int n=cardPoints.length-1,sum=0;
        int temp=max;
        for(int i=k-1;i>=0;i--)
        {
            max=max-cardPoints[i];
            sum+=cardPoints[n--];
            temp=Math.max(temp,max+sum);        
        }
        return temp;
    }
}