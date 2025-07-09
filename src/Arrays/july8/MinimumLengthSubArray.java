package Arrays.july8;

public class MinimumLengthSubArray {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLength = Integer.MAX_VALUE;  // Initialize to a large number
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];  // Expand the window by adding nums[right]

            // While the current sum is greater than or equal to the target, shrink the window
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);  // Track the minimum length
                currentSum -= nums[left];  // Remove nums[left] from the sum
                left++;  // Move left pointer to shrink the window
            }
        }

        // If no valid subarray was found, return 0
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}
