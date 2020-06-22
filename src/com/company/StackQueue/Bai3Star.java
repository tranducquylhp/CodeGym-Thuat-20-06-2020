package com.company.StackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bai3Star {
    static List<Character> openChars = new ArrayList<>();
    static List<Character> closeChars = new ArrayList<>();
    public static void main(String[] args) {
        String str = "{[()]}";
        String str2 = "{[(])}";
        openChars.add('(');
        openChars.add('[');
        openChars.add('{');

        closeChars.add(')');
        closeChars.add(']');
        closeChars.add('}');

        System.out.println(checkValid(str));
        System.out.println(checkValid(str2));
    }

    public static boolean checkValid(String str){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            if (openChars.contains(str.charAt(i))){
                stack.push(str.charAt(i));
            } else {
                if (stack.empty()){
                    return false;
                }

                Character character = stack.pop();
                int index = closeChars.indexOf(str.charAt(i));
                if (character != openChars.get(index)){
                    return false;
                }
            }
        }
        if (stack.empty()){
            return true;
        } else {
            return false;
        }
    }
}
