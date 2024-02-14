class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        findPartitions(0, s, new ArrayList<>(), ans);
        return ans;
    }
    public void findPartitions(int index, String s, List<String> ds, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=index; i<s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i+1));
                findPartitions(i+1, s, ds, ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end) {
        while (start<end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
