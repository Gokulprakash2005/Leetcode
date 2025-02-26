class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[count++]=nums[i];
        }
        return arr;
    }
}