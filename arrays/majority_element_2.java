class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int element1 = Integer.MIN_VALUE, counter1 = 0, element2 = Integer.MIN_VALUE, counter2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter1 == 0 && nums[i] != element2) {
                element1 = nums[i];
                counter1++;
            } else if (counter2 == 0 && nums[i] != element1) {
                element2 = nums[i];
                counter2++;
            } else if (nums[i] == element1) {
                counter1++;
            } else if (nums[i] == element2) {
                counter2++;
            } else {
                counter1--;
                counter2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int occurance1 = 0, occurance2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1) {
                occurance1++;
            } else if (nums[i] == element2) {
                occurance2++;
            }
        }
        if (occurance1 > nums.length/3) {
            ans.add(element1);
        }
        if (occurance2 > nums.length/3) {
            ans.add(element2);
        }
        return ans;
    }
}
