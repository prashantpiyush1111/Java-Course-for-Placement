public class MergeArray {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder Ans = new StringBuilder();
        int i = 0;

        while(i < word1.length() || i < word2.length()){
            
            if(i < word1.length()){
                Ans.append(word1.charAt(i));
            }
            
            if(i < word2.length()){
                Ans.append(word2.charAt(i));
            }
            
            i++;
        }

        return Ans.toString();
    }

    public static void main(String[] args) {
        MergeArray obj = new MergeArray();
        
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println("Merged String: " + obj.mergeAlternately(word1, word2));
    }
}