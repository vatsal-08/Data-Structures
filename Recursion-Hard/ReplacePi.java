//Wherever you see "pi" , replace it with "3.14"
public class ReplacePi {
    public static String replace(String input, int start, int end) {
        if (start > end)
            return "";
        if (start == end)
            return Character.toString(input.charAt(start));
        String hs = "pi";
        if (input.substring(start, start + 2).equals(hs))
            return "3.14" + replace(input, start + 2, end);
        else
            return Character.toString(input.charAt(start)) + replace(input, start + 1, end);
    }

    // Return the changed string
    public static String replace(String input) {
        // Write your code here
        return replace(input, 0, input.length() - 1);
    }
}
