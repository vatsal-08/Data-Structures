public class SumOfDigits {
    public static int sumOfDigits(int input) {
        // Write your code here
        return input == 0 ? 0 : input % 10 + sumOfDigits(input / 10);
    }
}
