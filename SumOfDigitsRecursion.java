public class SumOfDigitsRecursion {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        int result = sumDigits(num);
        System.out.println("Sum of digits: " + result);
    }
}
