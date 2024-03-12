class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        zigzagLevelOrder(root, 0, ans);
        return ans;
    }
    public void zigzagLevelOrder(TreeNode root, int level, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(new ArrayList<>());
        }
        if (level%2 == 1) {
            ans.get(level).add(0, root.val);
        } else {
            ans.get(level).add(root.val);
        }
        zigzagLevelOrder(root.left, level+1, ans);
        zigzagLevelOrder(root.right, level+1, ans);
    }
}
