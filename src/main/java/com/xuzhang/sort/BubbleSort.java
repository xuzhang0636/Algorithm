package com.xuzhang.sort;

/**
 * Created by zhangxu on 17-12-4.
 */
public class BubbleSort {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                if (a[j] >= a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] a) {
        int arrayLength = a.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {2, 1, 4, 1, 3, 6};
        bubbleSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
