package TimeSpaceComplexity;

public class ArrayRotateCheck {
    public static int arrayRotateCheck(int[] arr) {

        int n = arr.length;
        if (n == 0)
            return 0;
        int min = arr[0], min_index = 0;
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
