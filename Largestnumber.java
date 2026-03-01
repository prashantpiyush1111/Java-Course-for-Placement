public class Largestnumber {

    public static int GetLargest(int number[]) {

        int Largest = Integer.MIN_VALUE;

        for(int i = 0; i < number.length; i++) {
            if(Largest < number[i]) {
                Largest = number[i];
            }
        }

        return Largest;
    }

    public static void main(String[] args) {

        int number[] = {2,5,1,6,8,4,10};

        System.out.println(GetLargest(number));
    }
}