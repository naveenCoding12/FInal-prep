package Arrays.july10;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";

        // define the stack for LIFO
        Stack<Character> valid=new Stack<>();

        // check for open brackets
        for (char c :s.toCharArray()){
            if(c =='(' || c =='{' || c=='['){
                valid.add(c);
            }
            else if (c==')' || c=='}' || c==']') {
                if (valid.isEmpty() && isValid(valid.pop(), c)) {
                    System.out.println(valid.isEmpty());
                }
            }
        }
        System.out.println(!valid.isEmpty());
    }

    static boolean isValid(char open , char close){
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
