import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // keyboard se input lene ke liye
        System.out.print("Enter a word or number: ");
        String original = sc.nextLine();       // jo user likhega wo yahan store hoga

        String reversed = "";                  // reverse banane ke liye empty string

        for(int i = original.length() - 1; i >= 0; i--) {  // last se first tak loop
            reversed = reversed + original.charAt(i);      // ulta character jod rahe
        }

        if(original.equals(reversed)) {        // check same hai ya nahi
            System.out.println("Palindrome hai");
        } else {
            System.out.println("Palindrome nahi hai");
        }
    }
}
