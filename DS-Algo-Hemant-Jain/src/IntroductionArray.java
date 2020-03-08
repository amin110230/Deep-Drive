public class IntroductionArray {

    public static void main(String[] args) {
//        arrayExample();
        twoDArrayExample();
    }

    public static void arrayExample() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        printArray(arr,10);
    }

    public static void printArray(int arr[], int count) {
        System.out.println("Values stored in array are : ");
        for (int i = 0; i < count; i++) {
            System.out.println(" " + arr[i]);
        }
    }

    public static void twoDArrayExample()
    {
        int[][] arr = new int[4][2];
        int count = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 2; j++)
                arr[i][j] = count++;
        print2DArray(arr, 4, 2);
    }

    public static void print2DArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

}
