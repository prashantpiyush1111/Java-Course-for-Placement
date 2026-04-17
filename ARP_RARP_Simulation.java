import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ARP_RARP_Simulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ARP Table (IP -> MAC)
        Map<String, String> arpTable = new HashMap<>();
        arpTable.put("192.168.1.1", "AA:BB:CC:DD:EE:01");
        arpTable.put("192.168.1.2", "AA:BB:CC:DD:EE:02");
        arpTable.put("192.168.1.3", "AA:BB:CC:DD:EE:03");

        // RARP Table (MAC -> IP)
        Map<String, String> rarpTable = new HashMap<>();
        rarpTable.put("AA:BB:CC:DD:EE:01", "192.168.1.1");
        rarpTable.put("AA:BB:CC:DD:EE:02", "192.168.1.2");
        rarpTable.put("AA:BB:CC:DD:EE:03", "192.168.1.3");

        while (true) {
            System.out.println("\n1. ARP (IP → MAC)");
            System.out.println("2. RARP (MAC → IP)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter IP Address: ");
                    String ip = sc.nextLine();

                    if (arpTable.containsKey(ip)) {
                        System.out.println("MAC Address: " + arpTable.get(ip));
                    } else {
                        System.out.println("IP not found in ARP Table!");
                    }
                    break;

                case 2:
                    System.out.print("Enter MAC Address: ");
                    String mac = sc.nextLine();

                    if (rarpTable.containsKey(mac)) {
                        System.out.println("IP Address: " + rarpTable.get(mac));
                    } else {
                        System.out.println("MAC not found in RARP Table!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}