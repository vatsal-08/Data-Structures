package TimeSpaceComplexity;

import java.util.*;

public class TripletSum {

    public static int tripletSum(int[] arr, int num) {
        // Your code goes here
        int i, c = 0;
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            int temp = num - arr[i];
            int low = i + 1, high = arr.length - 1;
            while (low < high) {
                if (arr[low] + arr[high] < temp) {
                    low++;
                } else if (arr[low] + arr[high] == temp) {

                    if (arr[low] == arr[high]) {
                        int x = high - low;
                        int l = x * (x + 1) / 2;
                        c += l;
                        break;
                    } else {
                        int x = arr[low];
                        int y = arr[high];
                        int p = low;
                        int k = high;
                        int d = 0, e = 0;
                        while (x == arr[p]) {
                            ++d;
                            ++p;
                        }
                        while (y == arr[k]) {
                            ++e;
                            --k;
                        }
                        c += d * e;
                        low += d;
                        high -= e;
                    }
                } else {
                    high--;
                }
            }

        }
        return c;
    }

}
