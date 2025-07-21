package Arrays.july9;

import java.util.HashSet;

public class ContainsDuplicatds {
    public static void main(String[] args) {
        int [] nums={1,2,3};

        // prepare a set to store the unique values in the array
        HashSet<Integer> seen=new HashSet<>();
        for (int num:nums){
            if(!seen.add(num)){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
