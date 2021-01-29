package LinkedList2;

public class ReverseLL {
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {

        if (head == null || head.next == null)
            return head;
        LinkedListNode<Integer> newHead = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
