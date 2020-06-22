package com.company.TimKiem;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int m = 6;
        for (int i = 0; i < arr.length && arr[i] < m / 2; i++) {
            int index = BinarySearch.binarySearch(arr, 0, arr.length - 1, m - arr[i]);
            if (index != -1) {
                System.out.println(i + " " + index);
            }
        }
    }
}
