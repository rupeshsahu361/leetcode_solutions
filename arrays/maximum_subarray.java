class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i=0; i<nums.length; i++) {
            current = Math.max(nums[i]+current, nums[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}
