public class CountZeroes {
    public static int countZerosRec(int input) {

        return input == 0 ? 0 : (input % 10 == 0 ? 1 + countZerosRec(input / 10) : countZerosRec(input / 10));
    }
}
