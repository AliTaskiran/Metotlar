public class fibonacciSeries {
    static int fib(int a) {
        return a != 1 && a != 2 ? fib(a - 1) + fib(a - 2) : 1;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
