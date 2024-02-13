class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
        } else if (target<0 || index==candidates.length) {
            return;
        } else {
            for (int i=index; i<candidates.length; i++) {
                if (i!=index && candidates[i]==candidates[i-1]) {
                    continue;
                }
                ds.add(candidates[i]);
                findCombination(i+1, candidates, ds, target-candidates[i], ans);
                ds.remove(ds.size()-1);
            }
        }
    }
}
