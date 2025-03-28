class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        int mid;
        while(left<=right)
        {
         mid=left+(right-left)/2;
            if(target<letters[mid])
            {
             
                right=mid-1;
            }
            else{
                   left=mid+1;
            }
        }
        return letters[left%letters.length];
    }
}