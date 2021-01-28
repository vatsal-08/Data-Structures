public class Searching {
    public static boolean check(int input[], int x, int index) {
        if (input.length == index)
            return false;
        if (input[index] == x)
            return true;
        return check(input, x, index + 1);
    }

    public static boolean checkNumber(int input[], int x) {

        return check(input, x, 0);

    }
}
