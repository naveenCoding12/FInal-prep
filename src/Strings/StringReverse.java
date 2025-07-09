package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String s="";
        // use the char array which is primitive and in place
        char [] charArr=s.toCharArray();
        int start=0,end=s.length()-1;
        while (start<end){
            char temp=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=temp;

            start++;
            end--;
        }
//        return new String(charArr);
    }
}
