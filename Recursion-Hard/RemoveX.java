
public class RemoveX {
    public static String removeX(String input, int start, int end) {
        if (start > end)
            return "";
        String x = "x";
        if (input.charAt(start) == x.charAt(0))
            return removeX(input, start + 1, end);
        return input.charAt(start) + removeX(input, start + 1, end);
    }

    // Return the changed string
    public static String removeX(String input) {
        // Write your code here

        return removeX(input, 0, input.length() - 1);
    }
}
