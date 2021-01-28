package LinkedList2;

public class DeleteNodeRecursive {
    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {

        int i = pos;
        if (head == null)
            return null;

        if (i == 0) {
            return head.next;
        }
        head.next = deleteNodeRec(head.next, i - 1);
        return head;

    }
}
