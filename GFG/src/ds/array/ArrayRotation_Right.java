import java.util.Scanner;

public class ArrayRotation_Right {


    void rightRotate(int[] arr, int numOfElement, int n) {
        for (int i = 0; i < numOfElement; i++) {
            rightRotateByOne(arr, n);
        }
    }

    void rightRotateByOne(int[] arr, int n) {
        int temp = arr[n -1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    void printArray(int[] arr, int n) {
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayRotation_Right arrayRotationRight = new ArrayRotation_Right();

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int numOfElement = scanner.nextInt();
        arrayRotationRight.rightRotate(arr, numOfElement, n);
        arrayRotationRight.printArray(arr, n);
    }
}
