class Solution {
    public int lengthOfLastWord(String s) {
        String str1[]=s.split(" ");
        return str1[str1.length-1].length();
    }
}