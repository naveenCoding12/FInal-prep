package Arrays.july8;

public class AverageSubArray {

    public static void main(String[] args) {

        int [] nums={1,12,-5,-6,50,3};
        int k=4;

        // sum upto k window size
        int windowSum=0;

        for (int i = 0; i <k ; i++) {
            windowSum+=nums[i];
        }
        int maxSum=windowSum;

        for (int i = k; i < nums.length ; i++) {
            windowSum+=nums[i]-nums[i-k];
            maxSum=Math.max(windowSum,maxSum);
        }
//        return (double) maxSum/k;
        System.out.println((double) maxSum/k);
    }
}
