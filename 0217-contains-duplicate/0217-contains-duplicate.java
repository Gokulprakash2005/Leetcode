class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> list1=new HashSet<>();
       for(int i:nums)
       {
        if(! list1.contains(i))
        {
            list1.add(i);
        }
        else{
            return true;
        }
       }
       return false;
    }
}