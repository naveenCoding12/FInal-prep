package Arrays.july7;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        List<Integer> list=new ArrayList<>();
        int target=9;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]+arr[i]==target){
                    list.add(i);
                    list.add(j);
            }
            }
        }
        System.out.println(list);
    }
}
