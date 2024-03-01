public class question258 {

        class Solution {
            public int addDigits(int num) {
                if (num >= 10) {
                    String numStr;
                    while (num >= 10) {
                        int sum = 0;
                        numStr = Integer.toString(num);
                        for (int i = 0; i < numStr.length(); i++) {
                            sum += numStr.charAt(i) - '0';
                        }
                        num = sum;
                    }
                    return num;
                }
                return num;
            }
        }
}
