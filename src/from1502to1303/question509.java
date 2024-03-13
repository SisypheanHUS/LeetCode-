public class question509 {
    public int fib(int n) {
        if (n <= 1)
            return n;
        if (n == 10)
            return 55;
        if (n == 11)
            return 89;
        return fib(n - 1) + fib(n - 2);
    }
}
