class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int len=s.length()/2;
        String str1=s.substring(0,len);
        String str2=s.substring(len,s.length());
        int v1=0;
        int v2=0;
        for(char c:str1.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                v1++;
            }
        }
          for(char c:str2.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                v2++;
            }
        }
        if(v1==v2)
        {
            return true;
        }
        return false;
    }
}