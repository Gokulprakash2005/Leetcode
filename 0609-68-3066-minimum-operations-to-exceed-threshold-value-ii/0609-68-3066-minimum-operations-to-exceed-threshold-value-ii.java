class Solution {
    public int minOperations(int[] nums, int k) {
         PriorityQueue<Long> pq = new PriorityQueue<>();
         for(int i:nums)
         {
            pq.offer((long)i);
         }
         int count=0;
         while( pq.size()>1 && pq.peek()<k )
         {
            long x=pq.poll();
            long y=pq.poll();
            pq.offer((long)(Math.min(x,y)*2)+(Math.max(x,y)));
            count++;
         }
         if(pq.peek()<k)
         {
            return -1;
         }
         return count;
    }
}