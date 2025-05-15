class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> maps1=new HashMap<>();
        HashMap<Character,Integer> maps2=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u')
            {
                maps1.put(c,maps1.getOrDefault(c,0)+1);
            }
            else
            {
                maps2.put(c,maps2.getOrDefault(c,0)+1);
            }
        }
        int max1=0,max2=0;
        for(int i:maps1.values())
        {
            if(i>max1)
            {
                max1=i;
            }
        }
         for(int i:maps2.values())
        {
            if(i>max2)
            {
                max2=i;
            }
        }
        return max1+max2;
    }
}