class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> (i1[0] - i2[0]));
        List<List<Integer>> mergedList = new ArrayList<>();
        int[] current = intervals[0];
        for (int i=1; i<intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current = merge(current, intervals[i]);
            } else {
                List<Integer> currentList = new ArrayList<>();
                currentList.add(current[0]);
                currentList.add(current[1]);
                mergedList.add(currentList);
                current = new int[]{intervals[i][0], intervals[i][1]};
            }
        }
        List<Integer> currentList = new ArrayList<>();
        currentList.add(current[0]);
        currentList.add(current[1]);
        mergedList.add(currentList);
        return convertToArray(mergedList);
    }

    public int[] merge(int[] i1, int[] i2) {
        return new int[]{i1[0], Math.max(i1[1], i2[1])};
    }

    public int[][] convertToArray(List<List<Integer>> list) {
        int[][] array = new int[list.size()][2];
        for (int i=0; i<list.size(); i++) {
            array[i][0] = list.get(i).get(0);
            array[i][1] = list.get(i).get(1);
        }
        return array;
    }
}
