import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter cost of Pencil: ");
            float pencil = sc.nextFloat();

            System.out.print("Enter cost of Pen: ");
            float pen = sc.nextFloat();

            System.out.print("Enter cost of Eraser: ");
            float eraser = sc.nextFloat();

            float total = pencil + pen + eraser;

            float gst = total * 0.18f;   // 18% GST
            float finalBill = total + gst;

            System.out.println("Total cost without GST: " + total);
            System.out.println("GST (18%): " + gst);
            System.out.println("Final Bill (including GST): " + finalBill);
        }
    }
}
