public class day220224 {
    class Solution {
        public int findJudge(int n, int[][] trust) {
            if(n==1) return 1;
            // count the trust of anyone
            int count[] = new int[n + 1];
            for (int i = 0; i < trust.length; i++) {
                count[trust[i][1]]++;
            }
            // check if s1 get all the trust
            for (int i = 0; i < count.length; i++) {
                if (count[i] == n - 1) {
                    // check if he trust anyone
                    for (int j = 0; j < trust.length; j++) {
                        if (trust[j][0] == i)
                            return -1;
                    }
                    return i;
                }
            }
            return -1;
        }

    }
    }

