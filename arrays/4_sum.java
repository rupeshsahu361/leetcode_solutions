class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start, end;
        long sumLastTwo;
        List<List<Integer>> quadruplets = new ArrayList<>();
        for (int i=0; i<nums.length-3; i++) {
            if (i!=00 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j=i+1; j<nums.length-2; j++) {
                if (j!=i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                start = j+1;
                end = nums.length-1;
                while (start<end) {
                    sumLastTwo = (long)target - (long)nums[i] - (long)nums[j];
                    if ((long)nums[start] + (long)nums[end] == sumLastTwo) {
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[j]);
                        quadruplet.add(nums[start]);
                        quadruplet.add(nums[end]);
                        quadruplets.add(quadruplet);
                        start++;
                        end--;
                        while (start<end && nums[start] == nums[start-1]) {
                            start++;
                        }
                        while (start<end && nums[end] == nums[end+1]) {
                            end--;
                        }
                    } else if ((long)nums[start] + (long)nums[end] < sumLastTwo) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return quadruplets;
    }
}
