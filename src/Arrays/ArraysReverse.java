package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysReverse {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};

        // assign the two pointer one from start anf second from the last
        int start=0,end= arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("using the collections :- ");
        List<Integer> list=Arrays.asList(1, 4, 3, 2, 6, 5);
        Collections.reverse(list);
        System.out.println(list);
    }
}
