package LinkedList2;

public class SwapTwoNodesLL {
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;
        int index1 = 0, index2 = 0;
        LinkedListNode<Integer> temp = head;
        while (i != index1) {
            index1++;
            temp = temp.next;
        }
        LinkedListNode<Integer> temp1 = head;
        while (j != index2) {
            index2++;
            temp1 = temp1.next;
        }
        int t = temp.data;
        temp.data = temp1.data;
        temp1.data = t;
        return head;
    }
}

// Sample Input 1 :
// 1
// 3 4 5 2 6 1 9 -1
// 3 4
// Sample Output 1 :
// 3 4 5 6 2 1 9
// Sample Input 2 :
// 2
// 10 20 30 40 -1
// 1 2
// 70 80 90 25 65 85 90 -1
// 0 6
// Sample Output 2 :
// 10 30 20 40
// 90 80 90 25 65 85 70