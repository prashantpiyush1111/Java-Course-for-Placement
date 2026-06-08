import java.util.*;

public class CoinStaircase {

    public static int arrangeCoins(int n) {
        return (int) ((Math.sqrt(1 + 8L * n) - 1) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(arrrangeCoins(n));

        sc.close();
    }
}