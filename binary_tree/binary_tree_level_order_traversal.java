class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(root, 0, ans);
        return ans;
    }
    public void levelOrder(TreeNode root, int level, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        levelOrder(root.left, level+1, ans);
        levelOrder(root.right, level+1, ans);
    }
}
