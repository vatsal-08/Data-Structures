//Multiply Two integers
//Restriction:Addition Or Subtraction can only be used.
public class Multiply {
    public static int multiplyTwoIntegers(int m, int n) {

        return n == 0 ? 0 : m + multiplyTwoIntegers(m, n - 1);
    }
}
