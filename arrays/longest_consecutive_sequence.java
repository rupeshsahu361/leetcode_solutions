class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int max = Integer.MIN_VALUE, current, streak;
        for (int num : set) {
            if (!set.contains(num-1)) {
                current = num;
                streak = 1;
                while (set.contains(current+1)) {
                    streak++;
                    current++;
                }
                max = Math.max(max, streak);
            }
        }
        return max;
    }
}
