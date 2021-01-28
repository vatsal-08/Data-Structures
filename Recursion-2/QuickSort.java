public class QuickSort {
    public static int partition(int a[], int lb, int ub) {
        int pivot = a[ub];
        int start = lb - 1;
        for (int j = lb; j < ub; j++) {
            if (a[j] < pivot) {
                start++;
                int temp = a[start];
                a[start] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[start + 1];
        a[start + 1] = a[ub];
        a[ub] = temp;
        return start + 1;
    }

    public static void quick(int a[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            quick(a, lb, loc - 1);
            quick(a, loc + 1, ub);
        }
    }

    public static void quickSort(int[] input) {
        quick(input, 0, input.length - 1);
    }
}
