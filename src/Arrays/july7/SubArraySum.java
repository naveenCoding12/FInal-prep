package Arrays.july7;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        Map<Integer, Integer> prefixSun = new HashMap<>();

        prefixSun.put(0,1);
        int currentsum=0;
        int count=0;
        for (int num:nums){
            currentsum=currentsum+num;
            if(prefixSun.containsKey(currentsum-k)){
                count+= prefixSun.get(currentsum-k);
            }
            prefixSun.put(currentsum, prefixSun.getOrDefault(currentsum,0)+1);
        }

    }
}
