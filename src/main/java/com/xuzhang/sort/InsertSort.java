package com.xuzhang.sort;

/**
 * Created by zhangxu on 17-12-5.
 */
public class InsertSort {
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            int temp = a[i];
            for (j = i - 1; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];

            }
            a[j + 1] = temp;
        }
    }

}
