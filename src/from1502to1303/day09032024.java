import java.util.HashSet;

public class day09032024 {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int count = 0;
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        int min = Integer.MAX_VALUE;
        for (int num : set1) {
            if (set2.contains(num)) {
                count++;
                min = Math.min(min, num);
            }
        }
        if(count==0) return -1;
        return min;
    }
}
