class Solution {
    double fractionalKnapsack(int W, Item arr[], int n)  {
        Arrays.sort(
            arr, 
            (i1, i2) -> {
                double diff = (double)(i2.value)/(double)(i2.weight) - (double)(i1.value)/(double)(i1.weight);
                if (diff > 0) {
                    return 1;
                } else if (diff < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        );
        double value = 0.0;
        for (int i = 0; i<n; i++) {
            if (arr[i].weight < W) {
                value += arr[i].value;
                W -= arr[i].weight;
            } else {
                value += ((double)(arr[i].value)/(double)(arr[i].weight))*(double)W;
                break;
            }
        }
        return value;
    }
}
