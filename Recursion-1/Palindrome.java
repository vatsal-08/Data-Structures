//This is for checking whether String is palindrome or not
public class Palindrome {
    public static boolean check(String input, int start, int end) {
        if (input.length() <= 1)
            return true;
        if (start == end)
            return true;
        if (input.charAt(start) == input.charAt(end))
            return check(input, start + 1, end - 1);
        return false;
    }

    public static boolean isStringPalindrome(String input) {

        return check(input, 0, input.length() - 1);

    }
}
