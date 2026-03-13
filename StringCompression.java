public class StringCompression {

    public static String compressedString(String word) {
        String newStr = "";

        for(int i = 0; i < word.length(); i++){

            int count = 1;

            while(i < word.length()-1 && word.charAt(i)==word.charAt(i+1) && count < word.length()){
                count++;
                i++;
            }

            newStr += count;
            newStr += word.charAt(i);
        }

        return newStr;
    }

    public static void main(String[] args) {
        String word = "aaaabbbcccddd";
        System.out.println(compressedString(word));
    }
}