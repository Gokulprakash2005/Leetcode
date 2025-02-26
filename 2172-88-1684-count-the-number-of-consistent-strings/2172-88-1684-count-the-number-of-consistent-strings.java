class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean b=true;
        int count=0;
        for(String str:words)
        {
            b=true;
            for(char c:str.toCharArray())
            {
                if(!allowed.contains(String.valueOf(c)))
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                count++;
            }
        }
        return count;
    }
}