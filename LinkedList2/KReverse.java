package LinkedList2;

public class KReverse {
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {

        if (head == null || head.data == 0)
            return null;

        if (k == 0)
            return head;
        LinkedListNode<Integer> current = head;

        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next = null;
        int count = 0;
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null)
            head.next = kReverse(next, k);
        return prev;
    }
}
