import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        // Swap using + and -
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
