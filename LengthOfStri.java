public class LengthOfStri {

    public static int Length(String str, int i) {

        if(i == str.length()) {
            return 0;
        }

        return 1 + Length(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(Length(str, 0));
    }
}