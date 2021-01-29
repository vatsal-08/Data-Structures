package LinkedList2;

public class Midpoint {
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        // Your code goes here

        if (head == null)
            return null;
        if (head.next == null) {
            return head;
        }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.next == null || fast.next.next == null)
                break;
        }
        return slow;

    }
}
