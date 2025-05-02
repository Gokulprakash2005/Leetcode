class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> que=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
        {
            que.add(i);
        }
        return (que.poll()-1)*(que.poll()-1);
    }
}