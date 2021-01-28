package LinkedList2;

public class DeleteEveryNNodes {
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

        if (M == 0)
            return null;

        LinkedListNode<Integer> curr = head, rem;
        int count;
        // Move M nodes and delete N nodes
        while (curr != null) {
            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }
            if (curr == null) {
                return head;
            }
            rem = curr.next;
            for (count = 1; count <= N && rem != null; count++) {
                LinkedListNode<Integer> temp = rem;
                rem = rem.next;

            }
            // link to remaining nodes
            // continue iteration for the remaining nodes
            curr.next = rem;
            curr = rem;
        }
        return head;
    }
}

// You have been given a singly linked list of integers along with two
// integers,'M,'and'N.'
// Traverse the linked list such that you retain the'M'nodes, then delete the
// next'N' nodes.
// Continue the same until the end of the linked list. To put it in other words,
// in the given
// linked list, you need to delete N nodes after every M nodes.Note: No need to
// print
// the list, it has already been taken care.Only return the new head to the
// list.
// Sample Input 1:1 1 2 3 4 5 6 7 8-1 2 2

// Sample Output 1:1 2 5 6

// Sample Input 2 :
// 2
// 10 20 30 40 50 60 -1
// 0 1
// 1 2 3 4 5 6 7 8 -1
// 2 3
// Sample Output 2 :
// 1 2 6 7