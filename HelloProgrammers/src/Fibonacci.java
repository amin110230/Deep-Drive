import java.util.Scanner;

public class Fibonacci {

    private static int calcFiboNaive (int n) {
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
        return curr;
    }

    private static long calcFiboFast (int n) {
        if (n <= 1)
            return n;

        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n+1; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }

    public static void main(String [] args) {
        Scanner scannerIn = new Scanner(System.in);
        int n = scannerIn.nextInt();
        System.out.println(calcFiboFast(n));
    }
}
