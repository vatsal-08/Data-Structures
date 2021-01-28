public class NoOfDigits {
    public static int count(int n) {
        return n == 0 ? 0 : 1 + count(n / 10);
    }
}
