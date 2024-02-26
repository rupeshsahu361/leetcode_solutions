import java.util.*;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        getTreeTraversal(root, pre, in, post);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(in);
        ans.add(pre);
        ans.add(post);
        return ans;
    }
    public static void getTreeTraversal(
        TreeNode root, 
        List<Integer> pre,
        List<Integer> in,
        List<Integer> post
    ) {
        if (root == null) {
            return;
        }
        pre.add(root.data);
        getTreeTraversal(root.left, pre, in, post);
        in.add(root.data);
        getTreeTraversal(root.right, pre, in, post);
        post.add(root.data);
    }
}
