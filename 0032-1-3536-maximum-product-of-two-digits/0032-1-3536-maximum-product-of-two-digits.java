class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list1=new ArrayList<>();
        while(n!=0)
        {
            list1.add(n%10);
            n=n/10;
        }
        int arr[]=new int[list1.size()];
        int count=0;
        Collections.reverse(list1);
        for(int i:list1)
        {
            arr[count++]=i;
        }
        int max=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               max=Math.max(max,arr[i]*arr[j]);
            }
        }
        return max;
    }
}