import java.util.Scanner;

public class testCodeForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    static String check(int n) {
        if(n==2) return "NO";
        if(n%2==0) return "YES";
        else return "NO";
    }
}
