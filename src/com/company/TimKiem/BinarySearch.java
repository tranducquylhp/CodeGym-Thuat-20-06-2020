package com.company.TimKiem;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 10, 12};
        int k = 9;
        System.out.println(binarySearch(arr, 0, arr.length - 1, k));
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (arr[middle] < value) {
            left = middle + 1;
            return binarySearch(arr, left, right, value);
        } else if (arr[middle] > value) {
            right = middle - 1;
            return binarySearch(arr, left, right, value);
        }

        return middle;
    }
}
