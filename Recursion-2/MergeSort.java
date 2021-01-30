
public class MergeSort {
    public static void merge(int[] a, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;
        int b[] = new int[ub + 1];
        while (i <= mid && j <= ub) {
            if (a[i] > a[j]) {
                b[k] = a[j];
                j++;
            } else {
                b[k] = a[i];
                i++;
            }
            k++;
        }
        while (i <= mid && j > ub) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (i > mid && j <= ub) {
            b[k] = a[j];
            j++;
            k++;
        }
        for (i = lb; i <= ub; i++) {
            a[i] = b[i];
        }
    }

    public static void mergeSort(int[] a, int lb, int ub) {
        if (ub > lb) {
            int mid = (ub - lb) / 2 + lb;
            mergeSort(a, lb, mid);
            mergeSort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }
    }

    public static void mergeSort(int[] input) {
        // Write your code here
        mergeSort(input, 0, input.length - 1);
    }
}
