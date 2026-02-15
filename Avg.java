import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter value of A");
            int A = sc.nextInt();

            System.out.println("Enter value of B");
            int B = sc.nextInt();

            System.out.println("Enter value of C");
            int C = sc.nextInt();

            int sum = A + B + C;
            double avg = sum / 3;

            System.out.println("Average of A, B and C is: " + avg);
        }
    }
}
