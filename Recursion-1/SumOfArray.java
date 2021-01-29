public class SumOfArray {

    public static int sum(int a[], int index) {
        if (a.length == index)
            return 0;
        return a[index] + sum(a, 1);
    }

    public static int sum(int a[]) {
        return sum(a, 0);
    }
}
