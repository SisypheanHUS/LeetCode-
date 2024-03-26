package future;

import java.util.Arrays;

public class bagofTokens {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int cur = 0, last = tokens.length - 1;

        int maxscore = 0;
        int score = 0;

        while (cur <= last) {
            if (power >= tokens[cur]) {
                power -= tokens[cur];
                score++;
                maxscore = Math.max(score, maxscore);
                cur++;
            } else {
                if (score >= 1) {
                    power += tokens[cur];
                    score--;
                    cur++;
                }
                }
                break;
            }
        return maxscore;
    }

    public static void main(String[] args) {
        bagofTokens obj = new bagofTokens();
        int[] tokens = { 100, 200, 300, 400 };
        int power = 200;
        System.out.println(obj.bagOfTokensScore(tokens, power));
    }
}
