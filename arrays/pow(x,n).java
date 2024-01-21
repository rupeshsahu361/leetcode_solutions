class Solution {
    public double myPow(double x, int n) {
        boolean isNegative = n<0;
        long nn = isNegative ? -1*n : n;
        double ans = 1.0;
        while (nn > 0) {
            if (nn%2 == 1) {
                ans = ans*x;
                nn--;
            } else {
                x = x*x;
                nn = nn/2;
            }
        }
        return isNegative ? (double)(1.0)/(double)(ans) : ans;
    }
}
