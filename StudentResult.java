import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter marks of 5 subjects:");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 90) {
            System.out.println(name + " got Grade A+");
        } else if (percentage >= 75) {
            System.out.println(name + " got Grade A");
        } else if (percentage >= 60) {
            System.out.println(name + " got Grade B");
        } else if (percentage >= 40) {
            System.out.println(name + " got Grade C");
        } else {
            System.out.println(name + " is Fail");
            sc.close();
        }

    }
}
