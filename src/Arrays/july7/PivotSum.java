package Arrays.july7;

public class PivotSum {
    public static void main(String[] args) {
        int []  nums = {1,7,3,6,5,6};

        int totalSum=0;
        for (int num:nums){
            totalSum+=num;
        }
        int leftSum=0;

        for (int i = 0; i < nums.length ; i++) {
            if(leftSum==totalSum-leftSum-nums[i]){
//                return i;
            }
            leftSum+=nums[i];
        }
//        return -1;
    }
}
