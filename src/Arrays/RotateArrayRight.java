package Arrays;

import java.util.Arrays;

public class RotateArrayRight {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = arr.length;

        // Normalize d if d >

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 3: Reverse remaining n-d elements
        reverse(arr, d, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
