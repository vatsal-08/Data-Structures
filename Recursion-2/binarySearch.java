class BinarySearch {
    public static int binary(int a[], int element, int lb, int ub) {
        if (lb > ub) {
            return -1;
        }
        int mid = (lb + ub) / 2;
        if (a[mid] == element) {
            return mid;
        } else if (a[mid] > element) {
            return binary(a, element, lb, mid - 1);
        } else {
            return binary(a, element, mid + 1, ub);
        }
    }

    // element - number to be searched
    public static int binarySearch(int input[], int element) {
        // Write your code here
        return binary(input, element, 0, input.length - 1);
    }
}
