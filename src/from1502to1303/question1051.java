import java.util.Arrays;

public class question1051 {
    public int heightChecker(int[] heights) {
        int[] lmao = heights.clone();
        Arrays.sort(lmao);
        int i = 0;
        int count= 0;
        for(int bruh : heights){
            if(bruh != lmao[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
