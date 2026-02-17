public class Recursion10 {

    // Keypad mapping array
    static String[] keypad = {
        ".",      // 0
        "abc",    // 1
        "def",    // 2
        "ghi",    // 3
        "jkl",    // 4
        "mno",    // 5
        "pqrs",   // 6
        "tu",     // 7
        "vwx",    // 8
        "yz"      // 9
    };

    // Recursive function to generate combinations
    public static void printCombination(String str, int index, String combination) {

        // Base case: If all digits processed
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }

        // Current digit
        char currChar = str.charAt(index);

        // Convert char to integer
        int digit = currChar - '0';

        // Get corresponding letters from keypad
        String mapping = keypad[digit];

        // Loop through all letters of that digit
        for (int i = 0; i < mapping.length(); i++) {

            // Recursive call with next digit
            printCombination(str, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        String input = "23";

        printCombination(input, 0, "");
    }
}
