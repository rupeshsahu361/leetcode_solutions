class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, new ArrayList<>(), target, ans);
        return ans;
    }
    public void findCombination (
        int index, 
        int[] candidates, 
        List<Integer> ds, 
        int target, 
        List<List<Integer>> ans
    ) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        else if (target < 0 || index == candidates.length) {
            return;
        } else {
            ds.add(candidates[index]);
            findCombination(index, candidates, ds, target-candidates[index], ans);
            ds.remove(ds.size()-1);
            findCombination(index+1, candidates, ds, target, ans);
        }
    }
}
