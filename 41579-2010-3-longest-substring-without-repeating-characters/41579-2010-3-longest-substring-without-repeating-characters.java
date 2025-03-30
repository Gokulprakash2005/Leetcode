class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> list1=new HashSet<>();
        int max=0,start=0,end=0;
        while(end<s.length())
        {
            if(!list1.contains(s.charAt(end)))
            {
                list1.add(s.charAt(end));
                max=Math.max(max,(end-start)+1);
                end++;
            }
            else
            {
                list1.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}