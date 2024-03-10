import java.util.Arrays;

public class contest10032024 {
    public static void main(String[] args) {
        int[] apple = {1,3,2};
        int[] capacity = {4,3,1,5,2};
        contest10032024 obj = new contest10032024();
        System.out.println(obj.minimumBoxes(apple, capacity));
    }

    public int minimumBoxes(int[] apple, int[] capacity) {
            Arrays.sort(capacity);
            int sumOfApples = 0;
            for (int num : apple){
                sumOfApples += num;
            }
            int n = capacity.length;
            int count =0;
            while(sumOfApples > 0){
                    sumOfApples -= capacity[n-1];
                    count++;
                    n--;

            }
            return count;
    }
}
