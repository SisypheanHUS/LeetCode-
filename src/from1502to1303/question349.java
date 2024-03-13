import java.util.ArrayList;

public class question349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int[] count = new int[1000];
        for (int num : nums2) {
            count[num]++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int nem : nums1) {
            if (count[nem] > 0 && !(result.contains(nem))) {
                result.add(nem);
            }
        }
        int[] res = new int[result.size()];
        for (Integer na : result) {
            res[i] = na;
            i++;
        }
        return res;
    }
}
