public class Solution {
    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        List<String> ans = new ArrayList<>();
        allRootToLeaf(root, new ArrayList<>(), ans);
        return ans;
    }
    public static void allRootToLeaf(
        BinaryTreeNode root,
        List<String> list,
        List<String> ans
    ) {
        if (root == null) {
            return;
        }
        list.add(String.valueOf(root.data));
        if (root.left==null && root.right==null) {
            ans.add(String.join("", list));
        }
        allRootToLeaf(root.left, list, ans);
        allRootToLeaf(root.right, list, ans);
        list.remove(list.size()-1);
    }
}
