class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0, element = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter == 0) {
                element = nums[i];
                counter = 1;
            } else if (element == nums[i]) {
                counter++;
            } else {
                counter--;
            }
        }
        int occurance = 0;
        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i]) {
                occurance++;
            }
            if (occurance > (nums.length / 2)) {
                return element;
            }
        }
        return -1;
    }
}
