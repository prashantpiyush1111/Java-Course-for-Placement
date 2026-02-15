import java.util.Scanner;

public class Sqr {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter one Side of Square");
            int side1 = sc.nextInt();

            System.out.println("Enter another Side of Square");
            int side2 = sc.nextInt();

            int area = side1 * side2;

            System.out.println("Area of square is: " + area);
        }
    }
}
