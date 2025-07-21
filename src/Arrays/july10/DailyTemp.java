package Arrays.july10;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {

    public static void main(String[] args) {

        int [] temperatures={73,74,75,71,69,72,76,73};
        int n= temperatures.length;;
        int [] ans =new int[n];
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index=stack.pop();
                ans[index]=i-index;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
