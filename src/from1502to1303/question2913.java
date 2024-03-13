import java.util.HashSet;
import java.util.List;

public class question2913 {
    public static int sumCounts(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += 1;
            HashSet<Integer> set = new HashSet<>();
            set.add(nums.get(i));
            for (int j = i+1; j < nums.size(); j++) {
                set.add(nums.get(j));
                sum += set.size()*set.size();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumCounts(List.of(1, 2, 3)));
    }
}
