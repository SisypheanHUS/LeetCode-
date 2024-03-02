import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public static int[] mergeSort(int[] array,int L,int R){
        //chia ra 
        //THDB DKD
        if(L>R) return new int[0];
        if(L == R) {
            int[] singleArr = {array[L]};
            return singleArr;
        }

        //chia ra
        int key = (L+R)/2;
        int[] a1 = mergeSort(array,L,key);
        int[] a2 = mergeSort(array,key+1,R);

        //tron vao
        int[] result = merge(a1,a2);
        return result;



    }
    public static int[] merge(int[] a1,int[] a2){
        int n = a1.length+a2.length ;
        int[] result = new int[n];

        int i = 0,i1 = 0,i2 = 0;

        while(i<n){
            if(i1<a1.length&&i2<a2.length){
                //tuc la a1 va a2 khac rong 
                if(a1[i1]<= a2[i2]){
                    result[i] = a1[i1];
                    i++; i1++;
                }
                else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
            else {
                //a1 rong hoac a2 rong
                if(i1<a1.length){
                    //a1 khac rong
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }
                else{
                    //a2 khac rong
                    result[i] = a2[i2];
                    i++;
                    i2++;

                }
            }
        }

        return result;
    }
}