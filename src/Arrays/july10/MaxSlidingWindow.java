package Arrays.july10;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // remove elements that are not in window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            // remove the samller values of the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);
            //add the remaining elements
            if (i>=k-1){
                result[i-k+1]=nums[deque.peekFirst()];
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
