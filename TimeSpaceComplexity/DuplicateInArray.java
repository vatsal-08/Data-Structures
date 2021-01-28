package TimeSpaceComplexity;

public class DuplicateInArray {
    public static int duplicate(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int n = arr.length - 2;
        sum -= n * (n + 1) / 2;
        return sum;
    }
}
