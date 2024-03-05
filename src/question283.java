public class question283 {
        public void moveZeroes(int[] nums) {
            int[] newarr = new int[nums.length];
            for(int num : nums){
                if(num!=0){
                    newarr[num] = num;
                }
            }
        }
}
