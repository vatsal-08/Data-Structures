public class Printnumbers {
    public static void print(int n) {
        if (n == 0) {
            return;
        }

        print(n - 1);
        System.out.print(n + " ");
    }
}

/**
 * Input:6 Output:1 2 3 4 5 6
 */
