import java.util.HashSet;

public class Recursion9 {

    public static void subsequences(String str, int i, String newStr, HashSet<String> set) {
        
        // Base Case
        if (i == str.length()) {
            if (!set.contains(newStr)) {
                set.add(newStr);
                System.out.println(newStr);
            }
            return;
        }

        char currChar = str.charAt(i);

        // 1️⃣ Include current character
        subsequences(str, i + 1, newStr + currChar, set);

        // 2️⃣ Exclude current character
        subsequences(str, i + 1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
