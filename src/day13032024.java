import java.util.HashMap;

public class day13032024 {
    public int pivotInteger(int n) {
    int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
    int leftSum = 0;

    for (int i = 1; i < n; i++) {
        leftSum += i;
        if (leftSum == totalSum - leftSum+1) {
            return i;
        }
    }

    return -1; // Return -1 if no pivot found
}
    public static void main (String[]args){
        day13032024 d = new day13032024();
        System.out.println(d.pivotInteger(49));
    }
    }
