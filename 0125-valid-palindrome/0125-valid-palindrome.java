class Solution {
    public boolean isPalindrome(String s) {
     int start=0;
     int end=s.length()-1;
     while(start<end)
     {
        if(Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end)))
        {
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
            {
                return false;
            }
            start++;
            end--;
        }
        else if(Character.isDigit(s.charAt(start)) && Character.isDigit(s.charAt(end)))
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        else if(! Character.isLetter(s.charAt(start)) && !  Character.isDigit(s.charAt(start)))
        {
            start++;
        }
        else if(! Character.isLetter(s.charAt(end)) && ! Character.isDigit(s.charAt(end)))
        {
            end--;
        }
        else{
            return false;
        }
     }
     return true;
    }
}