package Arrays.july20;

public class ValidPalindromeByDelete {

    public static void main(String[] args) {
        String s="abca";

        int left=0 ,right=s.length()-1;

        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                boolean out=isPalindrome(s,left+1,right) || isPalindrome(s,left,right--);
            }
            left ++;
            right --;
        }
    }

    static boolean isPalindrome(String s, int left , int right){
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
        }
        return  true;
    }
}
