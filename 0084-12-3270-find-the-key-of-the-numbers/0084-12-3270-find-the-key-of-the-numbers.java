class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1=String.format("%04d",num1);
        String str2=String.format("%04d",num2);
        String str3=String.format("%04d",num3);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<4;i++)
        {
            char min=(char) Math.min(str1.charAt(i),Math.min(str2.charAt(i),str3.charAt(i)));
            str.append(min);
        }
        return Integer.parseInt(str.toString());
    }
}