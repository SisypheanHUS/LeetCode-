public class day190224 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 1) return true;
            if (n <= 0) return false;
            int i = 2;
            while (n > 1) {
                if (n % i != 0) return false;
                n /= 2;
            }
            return (n == 1);
        }
    }
}
