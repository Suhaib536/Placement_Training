class Solution {
    public int reverse(int x) {
        int r = 0;

        while (x != 0) {
            int digit = x % 10;
            int n = r * 10 + digit;
            if ((n - digit) / 10 != r) {
                return 0;
            }
            r = n;
            x /= 10;

        }
        return r;
    }
}
