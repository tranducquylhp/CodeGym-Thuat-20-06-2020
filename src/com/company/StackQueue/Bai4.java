package com.company.StackQueue;

import java.util.Stack;

public class Bai4 {
    public static void main(String[] args) {
        Character[] postfix ={'2', '3', '4', '+', '*', '5', '-', '2', '2', '*', '+'};
        float result = calculatePostfix(postfix);
        //neu ket qua la so nguyen thi hien thi ra dang so nguyen
        if (result - (int) result != 0){
            System.out.println(result);
        } else System.out.println((int) result);

    }

    public static float calculatePostfix(Character[] str){
        Stack<Float> stack = new Stack<>();
        for (int i=0; i<str.length; i++){
            char character = str[i];
            if (character != '+' && character != '-' && character != '*' && character != '/'){
                stack.push(Float.parseFloat(String.valueOf(character)));
            } else {
                float value = 0;
                float num1 = stack.pop();
                float num2 = stack.pop();
                switch (character){
                    case '+':
                        value = num2 + num1;
                        break;
                    case '-':
                        value = num2 - num1;
                        break;
                    case '*':
                        value = num2 * num1;
                        break;
                    case '/':
                        value = num2 / num1;
                        break;
                }

                stack.push(value);
            }
        }
        return stack.pop();
    }
}
