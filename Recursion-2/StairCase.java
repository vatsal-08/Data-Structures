class Staircase {
    public static int staircase(int n) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if (n < 3)
            return n;
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);

    }
}
