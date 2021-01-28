package TimeSpaceComplexity;

/**
 * FindUniqueElement
 */
public class FindUniqueElement {

    public static int findUnique(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res = res ^ arr[i];
        return res;
    }
}