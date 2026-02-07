public class Reverse{
    public static void PrintRev(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        PrintRev(str,index-1);
    }
    public static void main(String[]args){
        String str="abcd";
        PrintRev(str,str.length()-1);
    }
}