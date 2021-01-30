
public class PairStar {
    public static String addStars(String s, int start, int end) {
        if (start > end)
            return "";

        if (start == end)
            return Character.toString(s.charAt(start));

        if (s.charAt(start) == s.charAt(start + 1))
            return Character.toString(s.charAt(start)) + "*" + addStars(s, start + 1, end);
        return Character.toString(s.charAt(start)) + addStars(s, start + 1, end);
    }

    public static String addStars(String s) {
        // Write your code here

        return addStars(s, 0, s.length() - 1);
    }
}
