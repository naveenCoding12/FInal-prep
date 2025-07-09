package Arrays.july8;

import java.util.HashSet;
import java.util.Set;

// with this logic fails i f we get the duplicate values
public class MaxLengthSubString {
    public static void main(String[] args) {
        String s="abcabcbb";
        // hash set to store the current window characters
        Set<Character> charSet=new HashSet<>();
        int left=0;
        int max=0;

        for (int right = 0; right <s.length() ; right++) {
            if(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
