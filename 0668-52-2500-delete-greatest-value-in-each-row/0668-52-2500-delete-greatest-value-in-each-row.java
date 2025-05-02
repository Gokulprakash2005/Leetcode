class Solution {
    public int deleteGreatestValue(int[][] grid) {
       List< PriorityQueue<Integer>> list1 = new ArrayList<>();
       for(int i=0;i<grid.length;i++)
       {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int j=0;j<grid[0].length;j++)
        {
           pq.offer(grid[i][j]);
        }
           list1.add(pq);
       }
       int sum=0;
       for(int col=0;col<grid[0].length;col++)
       {
        int max=0;
        for(int row=0;row<grid.length;row++)
        {
            max=Math.max(max,list1.get(row).poll());
        }
        sum+=max;
       }
       return sum;
    }
}