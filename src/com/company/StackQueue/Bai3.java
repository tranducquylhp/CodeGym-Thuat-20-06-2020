package com.company.StackQueue;

import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        String str = "(()(())";
        System.out.println(checkValid(str));
    }

    public static boolean checkValid(String str){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '('){
                stack.push('(');
            } else {
                if (stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.empty()){
            return true;
        } else {
            return false;
        }
    }
}
