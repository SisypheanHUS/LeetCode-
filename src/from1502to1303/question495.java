public class question495 {
    public int findPoisonedDuration(int[] nums, int d) {
        int ans = d;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+d-1<nums[i]){
                ans+=d;// if nothing is common in interval
            }else {
                ans=ans+nums[i]-nums[i-1];// if common in interval just subtract
            }
        }
        return ans;
    }
}
