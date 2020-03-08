public class ArrayInterview {

    public static int SumArray(int arr[]) {
        int size = arr.length;
        int total = 0;
        int index = 0;
        for(index = 0; index < size; index++)
            total = total + arr[index];
        return total;
    }

    public static int SequentialSearch(int arr[], int size, int value) {
        int i = 0;
        for(i = 0; i < size; i++) {
            if(value == arr[i] )
                return i;
        }
        return -1;
    }

    public static int BinarySearch (int arr[], int size, int value) {
        // Binary Search Algorithm – Iterative Way
        int mid;
        int low = 0;
        int high = size-1;
        while (low <= high)
        {
            mid = low + (high-low)/2; // To avoid the overflow
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void rotateArray(int[] a, int n, int k) {
        reverseArray(a,0,k-1);
        reverseArray(a,k,n-1);
        reverseArray(a,0,n-1);
    }

    public static void reverseArray(int[] a,int start, int end) {
        for(int i = start, j = end; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static int maxSubArraySum(int[] a, int size) {
        int maxSoFar = 0, maxEndingHere = 0;
        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + a[i];
            if (maxEndingHere < 0)
                maxEndingHere = 0;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println("sum of all the values in array: " + SumArray(arr));

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println("Sequential Search result from Array : " + SequentialSearch(arr, arr.length, 7));

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println("Binary Search result from Array : " + BinarySearch(arr, arr.length, 7));

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        rotateArray(arr, arr.length, 4);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int[] arr = {1,-2,3,4,-4,6,-14,8,2};
        System.out.println("Max sub array sum : " + maxSubArraySum(arr, 9));
    }

}
