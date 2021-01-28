
public class GeometricSum {
    public static double findGeometricSum(int k) {
        // Write your code here
        if (k == 0)
            return 1;
        return 1 / (double) (1 << k) + findGeometricSum(k - 1);
    }
}
// For k, the result will be 1+1/2+1/4+1/8.....+1/(2^k)