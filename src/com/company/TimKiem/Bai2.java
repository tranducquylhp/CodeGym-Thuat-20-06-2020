package com.company.TimKiem;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int[] b = {7, 2, 5, 4, 6, 3, 3, 5, 3, 0};
        int[] a = {7, 2, 5, 3, 5, 0};
        int[] c = new int[b.length];
        int countC = 0; //dem so phan tu trong mang c
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; ) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    i++;
                } else {
                    int index = BinarySearch.binarySearch(c, 0, countC, b[j]);
                    if (index == -1) {
                        c[countC] = b[j];
                        countC++;
                    }
                }
            }
        }
        for (int i = 0; i < countC; i++) {
            System.out.println(c[i] + " ");
        }
    }
}
