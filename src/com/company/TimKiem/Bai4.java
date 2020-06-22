package com.company.TimKiem;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        int[] a = {1,5,3,2,4};
        int k = 6;
        Arrays.sort(a);
        int count = 0;
        for (int i=0; i<a.length; i++){
            int index = BinarySearch.binarySearch(a, 0,a.length-1, a[i] + k);
            if (index < i){
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
