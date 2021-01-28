
public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here

        int n = s.length();
        if (n == 0)
            return "";
        if (n == 1)
            return Character.toString(s.charAt(0));
        String ans = removeConsecutiveDuplicates(s.substring(1));
        if (s.charAt(0) != s.charAt(1))
            ans = Character.toString(s.charAt(0)) + ans;
        return ans;
    }
}
