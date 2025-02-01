class Solution {
    public int minInsertions(String s) {
        int stacks=0;
        int need=0,i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
            {
                stacks++;
            }
            else
            {
                if(i+1<s.length() && s.charAt(i+1)==')')
                {
                    i++;
                    if(stacks>0)
                    {
                    stacks--;
                    }
                    else
                    {
                        need++;
                    }
                }
                else
                {
                      if(stacks>0)
                      {
                        need++;
                        stacks--;
                      }
                      else
                      {
                        need=need+2;
                      }
                }
            }
            i++;
        }
        return stacks*2+need;
    }
}