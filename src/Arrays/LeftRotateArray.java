package Arrays;

import java.util.Arrays;

public class LeftRotateArray {

    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5, 6};
        int d=2;
        int n= arr.length;
        // first reverse an array from 0 to d-1 places
        reverse(arr,0,d-1);

        // reverse the d to n-1
        reverse(arr,d,n-1);
        //reverse the arr from o to n-1

        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr, int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
