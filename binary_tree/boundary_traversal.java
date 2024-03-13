import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> traverseBoundary(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        ans.addAll(addLeft(root.left));
        List<Integer> leaf = new ArrayList<>();
        addLeaf(root, leaf);
        ans.addAll(leaf);
        ans.addAll(addRight(root.right));
        return ans;
    }
    public static List<Integer> addLeft(TreeNode root) {
        TreeNode cur = root.left;
        List<Integer> left = new ArrayList<>();
        while (cur != null) {
            if (!isLeaf(cur)) {
                left.add(cur.data);
            }
            cur = cur.left!=null ? cur.left : cur.right;
        }
        return left;
    }
    public static List<Integer> addRight(TreeNode root) {
        TreeNode cur = root.right;
        List<Integer> right = new ArrayList<>();
        while (right != null) {
            if (!isLeaf(cur)) {
                right.add(0, cur.data);
            }
            cur = cur.right!=null ? cur.right : cur.left;
        }
        return right;
    }
    public static void addLeaf(TreeNode root, List<Integer> leaf) {
        if (isLeaf(root)) {
            leaf.add(root.data);
            return;
        }
        if (root.left != null) {
            addLeaf(root.left, leaf);
        }
        if (root.right != null) {
            addLeaf(root.right, leaf);
        }
    }
    public static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
