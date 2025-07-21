package Arrays.july20;

public class LongestPalindrome {

    public static void main(String[] args) {

        String s= "abccccdd";

        char [] freq= new char[128];

        for (char ch:s.toCharArray()){
            freq[ch]++;
        }

        int length=0;
        boolean hasOdd=false;

        for (int count : freq){
            length+=count/2*2;
            if(count%2==1){
                hasOdd=true;
            }
        }
        System.out.println(hasOdd ? length+1:length);
    }
}
