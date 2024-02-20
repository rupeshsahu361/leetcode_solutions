class Tree {
    ArrayList<Integer> leftView(Node root) {
      ArrayList<Integer> ans = new ArrayList<>();
      leftView(root, 0, ans);
      return ans;
    }
    
    public void leftView(Node root, int level, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        if (ans.size() == level) {
            ans.add(root.data);
        }
        leftView(root.left, level+1, ans);
        leftView(root.right, level+1, ans);
        return;
    }
}
