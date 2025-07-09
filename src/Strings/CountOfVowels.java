package Strings;

public class CountOfVowels {

    public static void main(String[] args) {
        String s="asE".toLowerCase();

        int vowelCount=0 ,consonantCount=0;

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(Character.isAlphabetic(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    vowelCount++;
                }
                else{

                    consonantCount++;
                }
            }
        }
        System.out.println(String.format("voewlCOunt "+ vowelCount + "consat" +consonantCount));
    }
}
