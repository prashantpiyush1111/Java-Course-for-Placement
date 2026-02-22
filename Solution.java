import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.primePalindrome(n));
        
        sc.close();
    }

    public int primePalindrome(int n) {
        while (true) {
            if (isPalindrome(n) && isPrime(n)) {
                return n;
            }
            n++;
        }
    }

    private boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}