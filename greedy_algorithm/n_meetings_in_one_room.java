class Solution {
    public static int maxMeetings(int start[], int end[], int n) {
        List<List<Integer>> meetings = new ArrayList<>();
        for (int i=0; i<n; i++) {
            meetings.add(Arrays.asList(start[i], end[i]));
        }
        Collections.sort(meetings, (m1, m2) -> m1.get(1)-m2.get(1));
        int ans = 1, lastEnd = meetings.get(0).get(1);
        for (int i=1; i<n; i++) {
            if (meetings.get(i).get(0) > lastEnd) {
                lastEnd = meetings.get(i).get(1);
                ans++;
            }
        }
        return ans;
    }
}
