public class day240224 {
    class Solution {
        public double myPow(double x, int n) {
            if (x == 0)
                return 0;
            else if (x == 1)
                return 1;
            else if (n == 0)
                return 1;
            else if (n == 1)
                return x;
            else if (n > 0) {
                double y = myPow(x, n / 2);
                if (n % 2 == 0) {
                    return y * y;
                } else {
                    return y * y * x;
                }
            } else if (n < 0) {
                double y = myPow(x, n / 2);
                if (n % 2 == 0) {
                    return y * y;
                } else {
                    return y * y * (1 / x);
                }
            } else {
                return 0;
            }
        }

    }
}
