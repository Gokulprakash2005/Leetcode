class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str1=new StringBuilder();
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++)
        {
             if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
             {
                str1.append(strs[0].charAt(i));
             }
            else
            {
                break;
            }
        }
        return str1.toString();
    }
}