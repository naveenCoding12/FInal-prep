package Arrays.july9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionArrays {
    public static void main(String[] args) {
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};

        // create the hasp map to store key as element and value as frequency
        // 4:1 , 9:1,5:0
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int num:nums1){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for (int num:nums2){
            if(hashMap.containsKey(num) && hashMap.get(num)>0){
                list.add(num);
                hashMap.put(num,hashMap.get(num)-1);
            }
        }

        System.out.println(Arrays.toString(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
