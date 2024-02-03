class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int start, end, sum;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i=0; i<nums.length-2; i++) {
            if (i!=0 && nums[i]==nums[i-1]) {
                continue;
            }
            start = i+1;
            end = nums.length-1;
            while (start<end) {
                sum = nums[i] + nums[start] + nums[end];
                if (sum<0) {
                    start++;
                } else if (sum>0) {
                    end--;
                } else {
                    List<Integer> list = Arrays.asList(nums[i], nums[start], nums[end]);
                    lists.add(list);
                    start++;
                    end--;
                    while (start<end && nums[start]==nums[start-1]) {
                        start++;
                    }
                    while (start<end && nums[end]==nums[end+1]) {
                        end--;
                    }
                }
            }
        }
        return lists;
    }
}
