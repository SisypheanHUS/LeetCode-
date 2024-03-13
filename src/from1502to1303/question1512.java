import java.util.HashMap;

public class question1512 {
    /*
        O(n^2) with 2 for loop
        public static int numIdenticalPairs(int[] nums) {
        int count= 0;
        for (int i =    0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] ==nums[j]) count++;
          }
     }
       return count;
  }
     */

    /*
        O(n^2) again
        public static int numIdenticalPairs(int[] nums) {
            int count = 0;
            int j = 1;
            int i = 0;
            while (i < nums.length - 1) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                j++;
                if (j > nums.length - 1) {
                    i++;
                    j = i + 1;
                }
            }
            return count;
        }
     */
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> countPair = new HashMap<>();
        //with key is number in array and value is how many times it occurer in array
        int count = 0;
        for (int num : nums){
            int check = countPair.getOrDefault(num,0);
            count += check;
            countPair.put(num,check+1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(arr));
    }
}
