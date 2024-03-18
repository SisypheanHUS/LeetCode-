package future;

import java.util.Arrays;

public class day18032024 {
    public int findMinArrowShots(int[][] points) {
        int count = 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int i = 0;
        while (i < points.length) {
            int end = points[i][1];
            i++;
            while (i < points.length && points[i][0] <= end) {
                i++;
            }
            count++;
        }
        return count;
    }
}
