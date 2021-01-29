public class LastIndex {
    public static int lastind(int input[], int x, int end) {
        if (end < 0)
            return -1;
        if (input[end] == x)
            return end;
        int a = lastind(input, x, end - 1);
        return a;
    }

    public static int lastIndex(int input[], int x) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        return lastind(input, x, input.length - 1);
    }
}
