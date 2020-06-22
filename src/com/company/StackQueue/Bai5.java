package com.company.StackQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Bai5 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,6,2};
        System.out.println(Arrays.toString(sortUp(arr)));
        System.out.println(Arrays.toString(sortDown(arr)));
    }

    public static int[] sortUp(int[] arr){
        PriorityQueue<Integer> deque =new PriorityQueue<>();
        pushElement(arr, deque);
        return arr;
    }

    public static int[] sortDown(int[] arr){
        PriorityQueue<Integer> deque =new PriorityQueue<>(new CustomComparator());
        pushElement(arr, deque);
        return arr;
    }

    public static void pushElement(int[] arr, PriorityQueue<Integer> deque){
        for (int i=0; i<arr.length; i++){
            deque.add(arr[i]);
        }
        for (int i=0; i<arr.length; i++){
            arr[i] = deque.remove();
        }
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        if (number1 > number2) {
            return -1;
        }
        else if (number1 < number2) {
            return 1;
        }
        else {
            return 0;
        }
    }
}