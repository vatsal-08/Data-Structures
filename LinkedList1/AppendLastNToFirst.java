package LinkedList1;

public class AppendLastNToFirst {
    public static int length(LinkedListNode<Integer> head) {
        if (head == null)
            return 0;
        LinkedListNode<Integer> temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        return c;
    }

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        // Your code goes here
        if (head == null || n == 0)
            return head;
        LinkedListNode<Integer> temp = head;
        int len = length(head);
        len = len - n;
        int c = 0;
        while (c + 1 < len && temp != null) {
            temp = temp.next;
            c++;
        }
        LinkedListNode<Integer> temp1 = temp;
        temp1 = temp1.next;
        temp.next = null;
        LinkedListNode<Integer> temp2 = temp1;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = head;
        return temp1;
    }
}
