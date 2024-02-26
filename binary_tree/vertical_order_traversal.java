class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> leftAns = new ArrayList<>();
        leftAns.add(new ArrayList<>());
        List<List<Integer>> rightAns = new ArrayList<>();
        verticalTraversal(root, 0, leftAns, rightAns);
        leftAns.remove(0);
        Collections.reverse(leftAns);
        ans.addAll(leftAns);
        ans.addAll(rightAns);
        ans.stream().forEach(
            list -> Collections.sort(list)
        );
        return ans;
    }

    public void verticalTraversal(
        TreeNode root, 
        int index, 
        List<List<Integer>> leftAns, 
        List<List<Integer>> rightAns
    ) {
        if (root == null) {
            return;
        }
        if (index<0) {
            addAtIndex(leftAns, Math.abs(index), root.val);
        } else {
            addAtIndex(rightAns, index, root.val);
        }
        verticalTraversal(root.left, index-1, leftAns, rightAns);
        verticalTraversal(root.right, index+1, leftAns, rightAns);
    }

    public void addAtIndex(List<List<Integer>> list, int index, int val) {
        if (list.size() == index) {
            list.add(new ArrayList<>());
        }
        list.get(index).add(val);
    }
}
