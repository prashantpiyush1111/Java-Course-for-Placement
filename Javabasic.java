
import java.util.Scanner;

public class Javabasic {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter income");
        int income = sc.nextInt();
        int tax;
        System.out.println("Enter your income");
        if(income < 50000){
            tax=0;
        }
        else if(income>=50000&& income<=100000){
            tax = (int)(income*.2);
        }
        else {
            tax=(int)(income*.3);
        }
            System.out.println("Tax is:"+tax);
        

       }
    }
}