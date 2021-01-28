public class DoesScontainsT {
    public static boolean checkSequence(String a, String b, int m, int n) {
        if (n == 0)
            return true;
        if (m == 0)
            return false;

        if (a.charAt(m - 1) == b.charAt(n - 1))
            return checkSequence(a, b, m - 1, n - 1);
        return checkSequence(a, b, m - 1, n);
    }

    public static boolean checkSequence(String a, String b) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        int m = a.length();
        int n = b.length();
        return checkSequence(a, b, m, n);
    }
}
