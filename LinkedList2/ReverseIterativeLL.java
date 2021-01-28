package LinkedList2;

public class ReverseIterativeLL {
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> curr = head;

        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
