class PrintAllCodes {
    public static char getChar(int n) {
        return (char) (96 + n);
    }

    public static void printAllPossibleCodes(String input, String ans) {
        if (input.length() == 0) {
            System.out.println(ans);
            return;
        }
        int firstDigit = (input.charAt(0) - '0');
        printAllPossibleCodes(input.substring(1), ans + getChar(firstDigit));
        if (input.length() > 1) {
            int firstTwoDigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if (firstTwoDigits >= 10 && firstTwoDigits <= 26) {
                printAllPossibleCodes(input.substring(2), ans + getChar(firstTwoDigits));
            }
        }
    }

    public static void printAllPossibleCodes(String input) {
        printAllPossibleCodes(input, "");
    }
}
