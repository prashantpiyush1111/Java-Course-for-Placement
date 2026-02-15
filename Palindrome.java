import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a word or number: ");
            String original = sc.nextLine();

            String reversed = "";

            for(int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            if(original.equalsIgnoreCase(reversed)) {
                System.out.println("Palindrome hai");
            } else {
                System.out.println("Palindrome nahi hai");
            }
        }
    }
}
