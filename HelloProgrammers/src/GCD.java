import java.util.Scanner;

public class GCD {
    private static int gcdNaive(int a, int b) {
        int gcd = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > gcd) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    private static int euclidGcd(int a, int b) {
        int divisor = a >= b ? a : b;
        int divident = a <= b ? a : b;
        while (divisor != 0) {
            int reminder = divident % divisor;
            divident = divisor;
            divisor = reminder;

        }
        return divident;
    }

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        int a = scannerIn.nextInt();
        int b = scannerIn.nextInt();

        System.out.println(euclidGcd(a, b));
    }
}
