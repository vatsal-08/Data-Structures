public class FindIndex {
    public static int ind(int input[], int x, int start) {
        if (start >= input.length)
            return -1;
        if (input[start] == x)
            return start;
        int index = ind(input, x, start + 1);
        return index;
    }

    public static int firstIndex(int input[], int x) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        return ind(input, x, 0);

    }
}
