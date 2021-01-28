public class PrintSubsetsToSumK {
    public static void printSubsetsToK(int[] arr, int start, int end, int k, int[] output) {
        if (start > end) {
            if (k == 0) {
                // valid pair
                for (int i : output) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            } else {
                return;
            }
        }
        int[] temp = new int[output.length + 1];
        for (int i = 0; i < output.length; i++) {
            temp[i] = output[i];
        }
        temp[temp.length - 1] = arr[start];
        printSubsetsToK(arr, start + 1, end, k - arr[start], temp);
        printSubsetsToK(arr, start + 1, end, k, output);
    }

    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        printSubsetsToK(input, 0, input.length - 1, k, new int[0]);
    }
}
