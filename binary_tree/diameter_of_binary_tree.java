class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(
            depth(root.left)+depth(root.right), 
            Math.max(
                diameterOfBinaryTree(root.left),
                diameterOfBinaryTree(root.right)
            )
        );
    }
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
