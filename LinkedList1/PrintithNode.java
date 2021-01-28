package LinkedList1;

public class PrintithNode {
    public static void printIthNode(LinkedListNode<Integer> head, int i) {
        // Your code goes here

        LinkedListNode<Integer> temp = head;
        int c = 0;
        while (temp != null) {
            if (c == i) {
                System.out.println(temp.data);
                break;
            }
            c++;
            temp = temp.next;
        }
    }
}
