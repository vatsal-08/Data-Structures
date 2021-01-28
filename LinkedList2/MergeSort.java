package LinkedList2;

public class MergeSort {
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        // Your code goes here

        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        LinkedListNode<Integer> t1 = head1, t2 = head2;
        LinkedListNode<Integer> head = null, tail = null;
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        // Your code goes here

        if (head == null)
            return null;
        if (head.next == null)
            return head;

        LinkedListNode<Integer> slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;
        LinkedListNode<Integer> mid = midPoint(head);
        LinkedListNode<Integer> second = mid.next;
        LinkedListNode<Integer> first = head;
        mid.next = null;
        LinkedListNode<Integer> head1 = mergeSort(first);
        LinkedListNode<Integer> head2 = mergeSort(second);
        return merge(head1, head2);

    }
}
