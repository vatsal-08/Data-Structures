package LinkedList1;

public class DeleteNodeinLL {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        // Your code goes here
        if (head == null)
            return head;
        if (pos == 0) {
            head = head.next;
            return head;
        }
        int c = 0;
        LinkedListNode<Integer> temp = head;
        while (c + 1 < pos && temp.next != null) {
            c++;
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
        return head;
    }
}
