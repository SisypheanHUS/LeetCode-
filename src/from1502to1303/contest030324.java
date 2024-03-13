import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class contest030324 {


        public static int[] resultArray(int[] nums) {
            if (nums.length < 2) {
                return nums;
            }

            List<Integer> arr1 = new ArrayList<>();
            List<Integer> arr2 = new ArrayList<>();

            arr1.add(nums[0]);
            arr2.add(nums[1]);

            for (int i = 2; i < nums.length; i++) {
                if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                    arr1.add(nums[i]);
                } else {
                    arr2.add(nums[i]);
                }
            }

            int[] result = new int[arr1.size() + arr2.size()];
            int index = 0;
            for (int num : arr1) {
                result[index++] = num;
            }
            for (int num : arr2) {
                result[index++] = num;
            }

            return result;
        }

    public static void main(String[] args) {
        int[] nums = {5,4,3,8};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
    }
