import java.util.HashMap;

public class question3005 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            int current = count.getOrDefault(num, 0);
            count.put(num, current + 1);
        }
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, count.get(num));
        }
        int sum = 0;
        for (Integer num : count.keySet()){
            if (count.get(num) == max) sum += count.get(num);
        }
        return sum;
    }
}
