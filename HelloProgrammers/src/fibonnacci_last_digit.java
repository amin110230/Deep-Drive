import java.util.Scanner;

public class fibonnacci_last_digit {
    private static int getFibonacciLastDigitNaive (int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 0; i < n - 1; ++i) {
            int temp = prev;
            prev = curr;
            curr = temp + curr;
        }
        return curr % 10;
    }

    private static int getFibonacciLastDigitFast (int n) {
        if (n <= 1)
            return n;

        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n+1; i++) {
            result[i] = (result[i-1] + result[i-2]) % 10;
        }
        return result[n];
    }

    public static void main(String [] args) {
        Scanner scannerIn = new Scanner(System.in);
        int n = scannerIn.nextInt();
        System.out.println(getFibonacciLastDigitFast(n));
    }
}
