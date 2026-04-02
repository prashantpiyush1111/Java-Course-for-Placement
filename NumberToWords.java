public class NumberToWords{
    static String[] words={"one","two", "three","four","five","six","seven","eight","nine","zero"};
    public static void PrintNum(int n){
        if(n==0){
            return ;
        }


        int lastDigit= n%10;
        PrintNum(n/10);
        System.out.println(words[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int n=123;
        PrintNum(n);
    }
    
}