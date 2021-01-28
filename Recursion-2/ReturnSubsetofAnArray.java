/**
 * ReturnSubsetofAnArray
 */
public class ReturnSubsetofAnArray {

    public static int[][] subsets(int arr[]) {

        return subsets(arr, 0);
    }

    public static int[][] subsets(int arr[], int start) {

        if (arr.length == start) {
            int Empty[][] = new int[1][0];
            return Empty;
        }

        int smallAns[][] = subsets(arr, start + 1);

        int[][] output = new int[smallAns.length * 2][];
        int l = 0;
        for (int i = 0; i < smallAns.length; i++) {
            output[l] = smallAns[i];
            l++;
        }
        for (int j = 0; j < smallAns.length; j++) {
            output[l] = new int[smallAns[j].length + 1];
            output[l][0] = arr[start];

            for (int k = 0; k < smallAns[j].length; k++) {
                output[l][k + 1] = smallAns[j][k];

            }
            l++;
        }
        return output;
    }
}