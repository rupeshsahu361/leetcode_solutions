class Solution {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0, j=0, count=0, max = 0;
        while (i<n) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
                max = Math.max(max, count);
            } else {
                count--;
                j++;
            }
        }
        return max;
    }
}
