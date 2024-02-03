class Solution {
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (j1, j2) -> (j2.profit-j1.profit));
        int maxDeadline = 0;
        for (int i=0; i<n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        int[] completed = new int[maxDeadline+1];
        for (int i=0; i<=maxDeadline; i++) {
            completed[i] = -1;
        }
        int jobs = 0, profit = 0;
        for (int i=0; i<n; i++) {
            for (int j=arr[i].deadline; j>0; j--) {
                if (completed[j]==-1) {
                    completed[j] = 1;
                    jobs++;
                    profit += arr[i].profit;
                    break;
                }
            }
        }
        return new int[]{jobs, profit};
    }
}
