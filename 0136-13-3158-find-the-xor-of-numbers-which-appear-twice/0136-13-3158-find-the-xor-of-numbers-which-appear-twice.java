class Solution {
    public int duplicateNumbersXOR(int[] nums) {
     ArrayList<Integer> list1=new ArrayList<>();
     ArrayList<Integer> list2=new ArrayList<>();
     for(int i:nums)
     {
        if(!list1.contains(i))
        {
            list1.add(i);
        }
        else
        {
            list2.add(i);
        }
     }
     if(list2.size()==0)
     {
        return 0;
     }
     else if(list2.size()==1)
     {
        return list2.get(0);
     }
     int ans=list2.get(0);
     for(int i=1;i<list2.size();i++)
     {
        ans=ans^list2.get(i);
     }
     return ans;
    }
}