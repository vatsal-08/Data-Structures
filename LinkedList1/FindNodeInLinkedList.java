package LinkedList1;

public class FindNodeInLinkedList {
    public static int findNode(LinkedListNode<Integer> head, int n) {
        // Your code goes here
        if (head == null)
            return -1;
        if (head.data == n)
            return 0;
        int c = 0;
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            if (temp.data == n)
                return c;
            temp = temp.next;
            c++;
        }
        return -1;
    }
}
