class Solution {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        // find the breakpoint
        int breakpoint = -1, temp;
        for (int i=length-2; i>=0; i--) {
            if (nums[i] < nums[i+1]) {
                breakpoint = i;
                break;
            }
        }
        
        // no solution: nums is sorted in descending order
        if (breakpoint == -1) {
            Arrays.sort(nums);
            return;
        }

        // find the next grater element
        for (int i=length-1; i>breakpoint; i--) {
            if (nums[i] > nums[breakpoint]) {
                temp = nums[i];
                nums[i] = nums[breakpoint];
                nums[breakpoint] = temp;
                break;
            }
        }

        // reverse the right of breakpoint
        int start = breakpoint+1, end = length-1;
        while (start<end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
