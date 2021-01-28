package LinkedList1;

class LengthOfLL {

    public static int length(LinkedListNode<Integer> head) {
        // Your code goes here
        if (head == null)
            return 0;
        int len = 1;
        LinkedListNode<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }
}