package future;

public class contest16032024question1 {
    public static void main(String[] args) {
        contest16032024question1 test = new contest16032024question1();
        int[] nums = {10,21,31};
        System.out.println(test.sumOfEncryptedInt(nums));
    }

    public int sumOfEncryptedInt(int[] nums) {
        int count = 0;
        int sum;
        for(int i =0;i<nums.length;i++){
            sum = encrypted(nums[i]);
            count+=sum;
        }
        return count;
    }

    public int encrypted(int num){
        int maxNum = 0;
        int originalNum = num;
        while(num != 0){
            if(num%10 > maxNum) maxNum = num%10;
            num /= 10;
        }
        int newNum = 0;
        String stringNum = Integer.toString(originalNum);
        for(int i = 0; i < stringNum.length(); i++){
            newNum = newNum * 10 + maxNum;
        }
        return newNum;
    }
}