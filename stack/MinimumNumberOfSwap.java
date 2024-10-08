//Problem 1963. Minimum Number of Swaps to Make the String Balanced

import java.util.Stack;

public class MinimumNumberOfSwap {
    public static void main(String[] args) {
        MinimumNumberOfSwap solution = new MinimumNumberOfSwap();

        System.out.println(solution.minSwaps("]][][["));
    }

    public int minSwaps(String s) {

        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(1);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(-1);
                }
            }
        }
        int unmatched = stack.size();
        return unmatched / 2;
    }
}
// Two pointer
// public int minSwaps(String s) {

// int balanceCounter=0;
// int swapNeeded=0;

// for(char c: s.toCharArray()){
// if(c=='['){
// balanceCounter++;
// }else{
// balanceCounter--;
// }
// if(balanceCounter<0){
// swapNeeded++;
// balanceCounter+=2;
// }
// }
// return swapNeeded;
// }
// }
