package Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="";
        // char is primitive and in place array
        char [] charArr=s.toCharArray();
        int start=0,end=s.length()-1;
        while (start<end){
            char temp=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=temp;

            start++;
            end--;
        }
        System.out.println(s.equals(new String(charArr)));
    }
}
