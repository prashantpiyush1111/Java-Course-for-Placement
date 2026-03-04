public class ReverseString {
    public static String ReverseString2(String s,int k){
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i+=2*k){
            int start=i;
            int end =Math.min(i+k-1, arr.length-1);
            while(start<end){
                char temp=arr[end];
                arr[end]=arr[start];
                arr[start]= temp;
                start++;
                end--;

            }
        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        System.out.println((ReverseString2(s, k)));

    }
    
    }

