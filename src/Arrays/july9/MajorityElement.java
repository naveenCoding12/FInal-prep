package Arrays.july9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums={3,2,1,8,9,3};
        List<Integer> list=new ArrayList<>();

        // use has mpa to count freq
        HashMap<Integer, Integer> freqMap=new HashMap<>();
        for (int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        // get values from the has nap
        for(int key: freqMap.keySet()){
            if(freqMap.get(key)>nums.length/3){
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
