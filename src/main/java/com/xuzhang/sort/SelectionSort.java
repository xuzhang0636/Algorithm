package com.xuzhang.sort;

/**
 * Created by zhangxu on 17-12-6.
 */
public class SelectionSort {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i; j < a.length - 1; j++) {
                if (a[j + 1] < a[index]) {
                    index = j + 1;
                }
            }
            if (index != i) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 2, 3, 1};
        sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
