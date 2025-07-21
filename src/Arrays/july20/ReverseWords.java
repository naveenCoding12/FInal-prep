package Arrays.july20;

public class ReverseWords {

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";

        String [] stringArray=s.split(" ");

        StringBuilder stringBuilder=new StringBuilder();

        for (String str: stringArray){
            stringBuilder.append(new StringBuilder(str).reverse()).append(" ");
        }
        System.out.println(stringBuilder);
    }

}
