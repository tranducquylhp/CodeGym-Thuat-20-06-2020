package com.company.StackQueue;

import java.util.Stack;

public class Bai2 {
    public static void main(String[] args) {
        int number = 10;
        Stack<Integer> stack = new Stack<>();
        swap10To2(number, stack);
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }

    public static void swap10To2(int number, Stack<Integer> stack) {
        if (number == 0) {
            return;
        }
        int mod = number % 2;
        stack.push(mod);

        swap10To2((number - mod) / 2, stack);
    }
}
