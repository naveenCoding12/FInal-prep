package Arrays.july20;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s="aba";
        char [] chars=s.toCharArray();
        int start=0 ,end=s.length()-1;
        while (start<end){
            char temp=chars[start];
             chars[start]=chars[end];
             chars[end]=temp;
             start++;
             end--;
        }
        System.out.println(s.equals(new String(chars)));
    }
}
