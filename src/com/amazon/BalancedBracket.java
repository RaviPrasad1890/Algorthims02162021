package com.amazon;

import java.util.ArrayDeque;
import java.util.Deque;


public class BalancedBracket {

    // Complete the isBalanced function below.
    static boolean isBalanced(String s) {
        Deque<Character> stack=  new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if (c1 == '(' || c1 == '[' || c1 == '{'){
                stack.push(c1);
                continue;
            }
            //At this moment, stack must have some opening parenthesis added into it.
            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch(c1){
                case ')':
                    check=stack.pop();
                    if(check=='{' || check=='[')
                        return false;
                    break;
                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='[')
                        return false;
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='(' || check=='{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (isBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

}
