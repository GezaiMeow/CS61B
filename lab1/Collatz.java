/** Class that prints the Collatz sequence starting from a given number.
 *  @SelinaYu YOUR NAME HERE
 */
public class Collatz {

    /** Collatz sequences
     * if n is even, then the next number is n/2.
     * if n is odd, then the next number is n*3 + 1. */
    public static int nextNumber(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return 3 * n + 1;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

