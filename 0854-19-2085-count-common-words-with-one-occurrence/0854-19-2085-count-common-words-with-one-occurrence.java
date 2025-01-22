class Solution {
    public int countWords(String[] words1, String[] words2) {
        ArrayList<String>list1=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<String>list3=new ArrayList<>();
        ArrayList<String>list4=new ArrayList<>();
        int count=0;
        for(String str1:words1)
        {
            if(!list1.contains(str1))
            {
                list1.add(str1);
            }
            else{
                list2.add(str1);
            }
        }
        for(String str2:words2)
        {
            if(!list3.contains(str2))
            {
                list3.add(str2);
            }
            else
            {
                list4.add(str2);
            }
        }
        for(int i=0;i<list1.size();i++)
        {
            if(list3.contains(list1.get(i)) && !list2.contains(list1.get(i)) && !list4.contains(list1.get(i)))
            {
             count++;
            }
        }
        return count;
    }
}