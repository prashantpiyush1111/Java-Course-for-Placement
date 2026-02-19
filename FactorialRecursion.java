public class FactorialRecursion {

    static int step = 0;

    public static int factorial(int n) {
        step++;
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial is: " + result);
        System.out.println("Steps taken: " + step);
    }
}
