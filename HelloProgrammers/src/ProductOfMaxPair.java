import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductOfMaxPair {

    static long getProductOfMaxPairNaive(int[] numbers) {
        int product = 0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                product = Math.max(product, numbers[i] * numbers[j]);
            }
        }
        return product;
    }

    static long getProductOfMaxPairFast(int[] numbers) {
        int n = numbers.length;
        int maxIndex1 = -1;
        for (int i = 0; i < n; i++) {
            if ((maxIndex1 == -1) || (numbers[i] > numbers[maxIndex1])) {
                maxIndex1 = i;
            }
        }
        int maxIndex2 = -1;
        for (int j = 0; j < n; j++) {
            if ((j != maxIndex1) && ((maxIndex2 == -1) || (numbers[j] > numbers[maxIndex2]))) {
                maxIndex2 = j;
            }
        }
        return (long)(numbers[maxIndex1] * numbers[maxIndex2]);
    }

    public static void main(String [] args) {
        FastScanner fastScanner = new FastScanner(System.in);
        int num = fastScanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = fastScanner.nextInt();
        }
        System.out.println(getProductOfMaxPairFast(numbers));
        /*
        // stress test
        while (true) {
            Random ran = new Random();
            int max = 5;
            int min = 2;
            int randomNum = ran.nextInt((max - min) + 1) + min;
            System.out.println("Random number: " + randomNum);
            int[] list = new int[randomNum];
            for (int i = 0; i < randomNum; i++) {
                list[i] = ran.nextInt((10) + 1);
                System.out.println(list[i]);
            }
            System.out.println("");
            double result1 = getProductOfMaxPairNaive(list);
            double result2 = getProductOfMaxPairFast(list);
            if (result1 != result2) {
                System.out.println("Error! slow:  " + result1 + " fast: " + result2);
                break;
            } else {
                System.out.println("OK");
            }
        }
         */

    }



    static class FastScanner {
        BufferedReader bufferedReader; //character-based input stream that can be used to read data line by line by readLine() method.
        StringTokenizer stringTokenizer; //allows to break a string into tokens.

        FastScanner(InputStream inputStream) {
            // InputStream to read data from a source as it may be a file, console, an array, peripheral device or socket.
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

    }

}
