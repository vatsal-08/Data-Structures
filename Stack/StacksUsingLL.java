package Stack;

class StacksUsingLL {

    // Define the data members

    Node top;

    public StacksUsingLL() {
        // Implement the Constructor
        top = null;

    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        // Implement the getSize() function
        if (top == null)
            return 0;
        Node temp = top;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        return (top == null);
    }

    public void push(int element) {
        // Implement the push(element) function
        Node temp = new Node(element);
        temp.data = element;
        temp.next = top;
        top = temp;
    }

    public int pop() {
        // Implement the pop() function
        if (top == null)
            return -1;
        int x = top.data;
        top = top.next;
        return x;
    }

    public int top() {
        // Implement the top() function
        if (top == null)
            return -1;
        return top.data;
    }
}