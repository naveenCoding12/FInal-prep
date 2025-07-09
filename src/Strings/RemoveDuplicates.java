package Strings;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String s="banana".toLowerCase();
        StringBuilder stringBuilder=new StringBuilder();
        int mask=0;
        for (int i = 0; i <s.length() ; i++) {
            int bitIndex=s.charAt(i)-'a';
            int bit=1<<bitIndex;

            if((mask & bit)==0){
                mask|=bit;
                stringBuilder.append(s.charAt(i));

            }

        }
        System.out.println(stringBuilder.toString());
    }
}
