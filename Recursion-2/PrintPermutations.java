import java.util.ArrayList;

public class PrintPermutations {

    private static ArrayList<String> ans = new ArrayList<>();

    public static ArrayList<String> FindPermutations(String str) {
        char[] arr = str.toCharArray();
        FindPermutationsHelper(arr, 0, arr.length - 1);
        return ans;
    }

    private static void FindPermutationsHelper(char[] a, int i, int j) {
        if (i >= j) {
            String permutation = "";
            for (int k = 0; k < a.length; k++) {
                permutation += (a[k]);
            }
            ans.add(permutation);
            return;
        }
        for (int k = i; k <= j; k++) {
            swap(a, i, k);
            FindPermutationsHelper(a, i + 1, j);
            swap(a, i, k);
        }
    }

    private static void swap(char[] a, int i, int j) {
        char te = a[i];
        a[i] = a[j];
        a[j] = te;
    }
}