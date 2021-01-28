package TimeSpaceComplexity;

import java.util.Arrays;

public class Intersection {
    public static void intersection(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j])
                i++;
            else
                j++;

        }

    }
}
