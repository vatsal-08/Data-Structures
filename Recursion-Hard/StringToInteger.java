
public class StringToInteger {
    public static int convertStringToInt(String input, int start, int end) {
        if (start > end)
            return 0;
        int x = input.charAt(end) - '0';
        return x + 10 * convertStringToInt(input, start, end - 1);

    }

    public static int convertStringToInt(String input) {
        // Write your code here
        return convertStringToInt(input, 0, input.length() - 1);
    }
}
