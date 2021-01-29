class Polynomial {
    int a[];

    // Main function isn't written!!
    // It's upto the you to add main function
    Polynomial() {
        a = new int[10];
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree > a.length - 1) {
            int temp[] = a;
            a = new int[degree + 1];
            for (int i = 0; i < temp.length; i++) {
                a[i] = temp[i];
            }
        }
        a[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed)
    // in increasing order of degree.
    public void print() {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                System.out.print(a[i] + "x" + i + " ");
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        Polynomial temp = new Polynomial();
        int m = Math.max(a.length, p.a.length);

        int ans = 0;

        for (int i = 0; i < m; i++) {
            if (a.length > i && p.a.length > i)
                ans = a[i] + p.a[i];
            else if (a.length > i)
                ans = a[i];
            else if (p.a.length > i)
                ans = p.a[i];
            temp.setCoefficient(i, ans);
        }
        return temp;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        Polynomial temp = new Polynomial();
        int m = Math.max(a.length, p.a.length);
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (a.length > i && p.a.length > i)
                ans = a[i] - p.a[i];

            else if (a.length > i)
                ans = a[i];

            else if (p.a.length > i)
                ans = -p.a[i];
            temp.setCoefficient(i, ans);
        }
        return temp;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial temp = new Polynomial();
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < p.a.length; j++) {
                if (a[i] != 0 && p.a[j] != 0) {
                    if (temp.a.length > i + j)
                        ans = temp.a[i + j] + (a[i] * p.a[j]);
                    else
                        ans = (a[i] * p.a[j]);
                    temp.setCoefficient(i + j, ans);
                }
            }
        }
        return temp;
    }

}
