import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
