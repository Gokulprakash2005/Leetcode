class Solution {
    public int findNumbers(int[] nums) {
       return iseven(nums);
    }
    
    public int iseven(int arr[])
    {
       int amount=0;
       for(int i:arr)
        {
        if(countdigits(i) % 2==0)
         {
            amount++;
         }
        }
        return amount;
    }
    
    public int countdigits(int number)
    {
        int count=0;
        while(number>0)
        {
            count++;
            number=number/10;
        }
        return count;
    }
}