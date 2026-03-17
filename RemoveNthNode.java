import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int count = 1;

        // length count karo
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        int k = count - n;

        // agar first node delete karni ho
        if (k == 0) {
            return head.next;
        }

        ListNode temp2 = head;

        for (int i = 1; i < k; i++) {
            temp2 = temp2.next;
        }

        // node delete
        temp2.next = temp2.next.next;

        return head;
    }

    // linked list print karne ke liye
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        // user se linked list input
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int n = sc.nextInt();

        head = removeNthFromEnd(head, n);

        printList(head);
    }
}