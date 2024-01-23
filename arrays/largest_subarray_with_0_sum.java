class GfG
{
    int maxLen(int arr[], int n)
    {
        if (arr.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        map.put(0, -1);
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum)) {
                max = Math.max(max, i-map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
