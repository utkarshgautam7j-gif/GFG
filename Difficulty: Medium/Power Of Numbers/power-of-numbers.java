class Solution {
    public int reverseExponentiation(int n) {
        int b = rev(n, 0);
        return pow(n, b);
    }

    public static int rev(int a, int reverse) {
        if (a == 0) {
            return reverse;
        }

        return rev(a / 10, reverse * 10 + a % 10);
    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;

        int call = pow(a, b / 2);

        if (b % 2 == 0)
            return call * call;
        else
            return call * call * a;
    }
}