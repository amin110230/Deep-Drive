import java.util.Scanner;

public class ArrayRotation_Left {

    void leftRotateByTempArr(int[] arr, int numOfElement, int n) {
        // method 1
        int[] temp = new int[numOfElement];
        for (int i = 0; i < numOfElement; i++) {
            temp[i] = arr[i];
        }
        for (int j = 0; j < n - numOfElement; j++) {
            arr[j] = arr[j + numOfElement];
        }
        for (int k = 0; k < numOfElement; k++) {
            arr[n - numOfElement + k] = temp[k];
        }

    }

    void leftRotate(int[] arr, int numOfElement, int n) {
        // method 2
        for (int i = 0; i < numOfElement; i++) {
            leftRotateByOne(arr, n);
        }
    }

    void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0];
        for (int j = 0; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = temp;
    }

    void leftRotateByJuggling(int arr[], int numOfElement, int n) {
        // method 3 [not acquired]
        int i, j, k, temp;
        int g_c_d = gcd(numOfElement, n);
        for (i = 0; i < g_c_d; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + numOfElement;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    void leftRotateByReversal(int[] arr, int numOfElement, int n) {
        // method 4 [Correct Answer Execution Time:0.41]
        if (numOfElement == 0) {
            return;
        }
        reverseArray(arr, 0, numOfElement - 1);
        reverseArray(arr, numOfElement, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void printArray(int[] arr, int n) {
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayRotation_Left arrayRotationLeft = new ArrayRotation_Left();
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int numOfElement = scanner.nextInt();
            if (numOfElement > n) {
                numOfElement = numOfElement % n;
            }
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
//            arrayRotation.leftRotate(arr, numOfElement, n);   // method 2
            arrayRotationLeft.leftRotateByReversal(arr, numOfElement, n);
            arrayRotationLeft.printArray(arr, n);
            System.out.println();
        }


//        Scanner scanner = new Scanner(System.in);
//        ArrayRotation arrayRotation = new ArrayRotation();
//        arrayRotation.leftRotateByTempArr(arr, numOfElement, n);    // method 1
//        arrayRotation.leftRotate(arr, numOfElement, n);   // method 2
//        arrayRotation.leftRotateByJuggling(arr, numOfElement, n);   // method 3
//        arrayRotation.printArray(arr, n);

//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int numOfElement = scanner.nextInt();
//        ArrayRotation arrayRotation = new ArrayRotation();
////        arrayRotation.leftRotateByTempArr(arr, numOfElement, n);    // method 1
////        arrayRotation.leftRotate(arr, numOfElement, n);   // method 2
//        arrayRotation.leftRotateByJuggling(arr, numOfElement, n);   // method 3
//        arrayRotation.printArray(arr, n);
    }


}
