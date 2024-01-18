import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int index1 = -1, index2 = -1;
        for (int i=0; i<nums.length; i++) {
            if (set.contains(target-nums[i])) {
                index2 = findIndex(nums, target-nums[i], i+1);
                if (index2 != -1) {
                    index1 = i;
                    break;
                }
            }
        }
        return new int[] {index1, index2};
    }

    public int findIndex(int[] nums, int num, int start) {
        int index = -1;
        for (int i=start; i<nums.length; i++) {
            if (nums[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }
}
