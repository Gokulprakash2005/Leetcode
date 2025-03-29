class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float> distinctAverages = new HashSet<>();
        Arrays.sort(nums);
        int j = 0;
        for (int i = nums.length - 1; i > j; i--) {
            int tot = nums[i] + nums[j++];
            float avg = (float) tot / 2;
            distinctAverages.add(avg);
        }
        return distinctAverages.size();
    }
}