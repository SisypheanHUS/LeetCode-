import java.util.Arrays;

public class contest10032024ques2 {
    public static void main(String[] args) {
        int[] happiness = {2,3,4,5};
        int k = 1;
        contest10032024ques2 obj = new contest10032024ques2();
        System.out.println(obj.maximumHappinessSum(happiness, k));
    }

    public long maximumHappinessSum(int[] happiness, int k) {
    Arrays.sort(happiness);
    int n = happiness.length;
    long sum = 0;
    int i = n - 1;
    while (k > 0) {
        sum += happiness[i];
        int j = i - 1;
        while (j >= 0) {
            happiness[j] = Math.max(happiness[j] - 1, 0);
            j--;
        }
        i--;
        k--;
    }
    return sum;
}
}
