class Solution {
    public int maxRepeating(String sequence, String word) {
      int count=0;
      StringBuilder str=new StringBuilder();
      while(true)
      {
        str.append(word);
        if(sequence.contains(str.toString()))
        {
            count++;
        }
        else
        {
            break;
        }
      }
      return count;
    }
}
