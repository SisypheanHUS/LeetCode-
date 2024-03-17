package future;

import java.util.*;
public class contest16032024question2 {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        long[] result = new long[m];
        boolean[] marked = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
            sum += nums[i];
        }
        for (int i = 0; i < m; i++) {
            int index = queries[i][0];
            int k = queries[i][1];
            if (!marked[index]) {
                marked[index] = true;
                sum -= nums[index];
            }
            while (k-- > 0 && !pq.isEmpty()) {
                int[] smallest = pq.peek();
                if (marked[smallest[1]]) {
                    pq.poll();
                    k++;
                } else {
                    pq.poll();
                    marked[smallest[1]] = true;
                    sum -= smallest[0];
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,2,3,1};
        int[][] queries = {{1,2},{3,3},{4,2}};
        contest16032024question2 test = new contest16032024question2();
        long[] result = test.unmarkedSumArray(nums, queries);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}