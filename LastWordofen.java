public class LastWordofen{

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Step 1: skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1)); // Output: 5
        System.out.println(lengthOfLastWord(s2)); // Output: 4
        System.out.println(lengthOfLastWord(s3)); // Output: 6
    }
}