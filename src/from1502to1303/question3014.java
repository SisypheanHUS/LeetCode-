import java.util.HashMap;

public class question3014 {
    public static int minimumPushes(String word) {
        int count = 0;
        for (int i = 1; i <= word.length(); i++) {
            count+=i/8 +1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumPushes("abcde"));
    }
}
