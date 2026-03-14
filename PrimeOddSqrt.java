
import java.util.Scanner;
public class PrimeOddSqrt {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        checkPrime(a);
        checkPrime(b);
        checkPrime(c);
    }
    public static void checkPrime(int num){
        boolean prime = true;
        if(num <= 1){
            prime = false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            double sqrt = Math.sqrt(num);
            if(num % 2 == 0){
                System.out.println(num + " Prime and Even , sqrt = " + sqrt);
            }else{
                System.out.println(num + " Prime and Odd , sqrt = " + sqrt);
            }
        }else{
            System.out.println(num + " is not Prime");
        }
    }
}