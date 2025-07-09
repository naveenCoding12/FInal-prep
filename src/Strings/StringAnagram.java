package Strings;

public class StringAnagram {
    public static void main(String[] args) {
        String s1="";
        String s2="";

        //anagram sames same length same frequency of char
        if(s1.length() != s2.length()){
//            return false;
        }
        int[] chars=new int[26];
        for (int i = 0; i < s1.length()-1 ; i++) {
            chars[s1.charAt(i)-'a']++;
        }

        for(int j=0;j<s2.length()-1;j++){
            chars[s2.charAt(j)-'a']--;
        }

        for(int ch:chars){
            if(ch!=0){
//                return false;
            }
        }
//        return true;
    }
}
