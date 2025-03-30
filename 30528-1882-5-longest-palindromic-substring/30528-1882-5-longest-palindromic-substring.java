class Solution {
    public String longestPalindrome(String s) {
        int len1=0,start=0,end=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            start=end=i;
            while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
            {
                if(end-start+1>len1)
                {
                str=s.substring(start,end+1);    
                len1=end-start+1;
                }
                start--;
                end++;
            }
        }
          for(int i=0;i<s.length();i++)
        {
            start=i;
            end=i+1;
            while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
            {
                if(end-start+1>len1)
                {
                str=s.substring(start,end+1); 
                len1=end-start+1;
                }
                start--;
                end++;
            }
        }
        return str;
    }
}