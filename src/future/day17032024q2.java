package future;
import java.util.*;

public class day17032024q2 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) { // No overlap
                result.add(interval);
            } else if (interval[0] > newInterval[1]) { // No overlap
                result.add(newInterval);
                newInterval = interval;
            } else { // Overlap case
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        result.add(newInterval); // Add the last interval
        return result.toArray(new int[result.size()][]); // Convert List to Array
    }


    public static void main(String[] args) {
        day17032024q2 test = new day17032024q2();
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = test.insert(intervals, newInterval);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}