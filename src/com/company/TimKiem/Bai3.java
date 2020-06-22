package com.company.TimKiem;

public class Bai3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};

        System.out.println(searchIndex(arr, 0, arr.length - 1));
    }

    public static int sumArr(int[] arr, int firstIndex, int lastIndex) {
        int sum = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int searchIndex(int[] arr, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        int sumLeft = sumArr(arr, 0, middle - 1);
        int sumRight = sumArr(arr, middle + 1, arr.length - 1);
        if (sumLeft < sumRight) {
            left = middle + 1;
            return searchIndex(arr, left, right);
        }

        if (sumLeft > sumRight) {
            right = middle - 1;
            return searchIndex(arr, left, right);
        }

        return middle;
    }
}
