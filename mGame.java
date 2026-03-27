import java.util.*;

class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

public class mGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Function call (FIXED)
        NimGame obj = new NimGame();
        boolean result = obj.canWinNim(n);

        // Output
        System.out.println(result);
    }
}