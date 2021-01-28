package TimeSpaceComplexity;

public class PairSum {
    public static int pairSum(int[] arr, int sum) {
        // Your code goes here

        int count = 0;// Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
        return count;

    }
}
