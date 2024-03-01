public class day010324 {
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            StringBuilder maxodd = new StringBuilder();
            int[] count = new int[2];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - '0']++;
            }
            if (count[1] == 1) {
                while (count[0] > 0) {
                    maxodd.append("0");
                    count[0]--;
                }
                maxodd.append("1");
                return maxodd.toString();

            } else if (count[1] > 1) {
                while (count[1] != 1) {
                    maxodd.append("1");
                    count[1]--;
                }
                while (count[0] > 0) {
                    maxodd.append("0");
                    count[0]--;
                }
                maxodd.append("1");

                return maxodd.toString();
            }
            return "0";
        }
    }
}
