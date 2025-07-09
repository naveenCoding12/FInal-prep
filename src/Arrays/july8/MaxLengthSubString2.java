package Arrays.july8;

import java.util.HashMap;

public class MaxLengthSubString2 {
    public static void main(String[] args) {
        String s="pwwkew";

        HashMap<Character,Integer> charIndexMap=new HashMap<>();
        int left=0;
        int max=0;

        for (int right = 0; right <s.length() ; right++) {
            if(charIndexMap.containsKey(s.charAt(right))){
                // update the last index of the character
                left=Math.max(left,charIndexMap.get(s.charAt(right))+1);
            }
            charIndexMap.put(s.charAt(right),right);
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
