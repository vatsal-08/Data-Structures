import java.util.Scanner;

class ComplexNumbers {
    private int real, imag;

    public ComplexNumbers(int real, int imag) {
        this.imag = imag;
        this.real = real;
    }

    public void plus(ComplexNumbers comp) {
        this.real += comp.real;
        this.imag += comp.imag;
    }

    public void multiply(ComplexNumbers comp) {
        int x, y;
        x = this.real * comp.real - this.imag * comp.imag;
        y = this.imag * comp.real + comp.imag * this.real;
        this.real = x;
        this.imag = y;
    }

    public void print() {
        System.out.println(real + " + i" + imag);
    }
}

/**
 * Complex
 */
public class Complex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            s.close();
            return;
        }
        s.close();
    }
}