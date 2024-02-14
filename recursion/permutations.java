class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutation(0, nums, ans);
        return ans;
    }
    public void findPermutation(int index, int[] nums, List<List<Integer>> ans) {
        if (index==nums.length) {
            List<Integer> p = new ArrayList<>();
            for (int i=0; i<nums.length; i++) {
                p.add(nums[i]);
            }
            ans.add(p);
        } else {
            for (int i=index; i<nums.length; i++) {
                swap(nums, index, i);
                findPermutation(index+1, nums, ans);
                swap(nums, index, i);
            }
        }
    }
    public void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
}
