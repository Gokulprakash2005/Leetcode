class Solution {
    public int removeElement(int[] nums1, int val) {
        int ind=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]!=val)
            {
                nums1[ind]=nums1[i];
                ind++;
            }
        }
        return ind;
    }
}
