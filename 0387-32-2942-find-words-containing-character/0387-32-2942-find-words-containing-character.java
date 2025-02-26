class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            int ans=words[i].indexOf(x);
            if(ans!=-1)
            {
                list1.add(i);
            }
        }
        return list1;
    }
}