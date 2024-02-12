class Solution {
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> sumArray = new ArrayList<>();
        subsetSumsRecursive(arr, N, sumArray, 0, 0);
        return sumArray;
    }
    
    void subsetSumsRecursive(ArrayList<Integer> arr, int N, ArrayList<Integer> sumArray, int sum, int index) {
        if (index == N) {
            sumArray.add(sum);
            return;
        }
        subsetSumsRecursive(arr, N, sumArray, sum + arr.get(index), index+1);
        subsetSumsRecursive(arr, N, sumArray, sum, index+1);
        return;
    }
    
}
