public class AllIndices {
    public static int[] all(int input[], int x, int start) {
        if (start == input.length)
            return new int[0];

        int other[] = all(input, x, start + 1);
        if (input[start] == x) {
            int ans[] = new int[other.length + 1];
            ans[0] = start;
            for (int i = 1; i < ans.length; ++i) {
                ans[i] = other[i - 1];
            }
            return ans;
        }
        return other;
    }

    public static int[] allIndexes(int input[], int x) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        return all(input, x, 0);
    }
}
