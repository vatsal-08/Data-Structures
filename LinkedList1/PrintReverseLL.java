package LinkedList1;

public class PrintReverseLL {
    public static int len(LinkedListNode<Integer> head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    public static void printReverse(LinkedListNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;
        printReverse(root.next);
        System.out.print(root.data + " ");

    }
}
