public class Recursion6 {

    public static void moveAllX(String str, int idx, int count, String newString) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + 'X';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString = newString + currChar;
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String args[]) {
        String str = "axbcxxa";
        moveAllX(str, 0, 0, "");
    }
}
