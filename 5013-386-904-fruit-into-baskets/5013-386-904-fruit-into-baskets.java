class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        int l=0,r=0,maxsum=0;
        while(r<fruits.length)
        {
                maps.put(fruits[r],maps.getOrDefault(fruits[r],0)+1);
            if(maps.size()>2)
            {
                while(maps.size()>2)
                {
                    maps.put(fruits[l],maps.get(fruits[l])-1);
                    if(maps.get(fruits[l])==0)
                    {
                        maps.remove(fruits[l]);
                    }
                    l++;
                }
            }
            maxsum=Math.max(maxsum,r-l+1);
            r++;
        }
        return maxsum;
    }
}