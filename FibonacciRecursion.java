public class FibonacciRecursion {

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive Case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int number = 6;

        int result = fibonacci(number);

        System.out.println("Fibonacci number at position " + number + " is: " + result);
    }
}