class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[26];
        for(char i:s.toCharArray())
        {
             arr[(int) i - 97]++;
        }
         for(char j:t.toCharArray())
        {
             arr[(int) j - 97]--;
        }
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]!=0)
           {
            return false;
           }
        }
        return true;
    }
}