package com.yellow.arithmetic.sort;

import static com.yellow.arithmetic.util.CommonUtil.printArr;
import static com.yellow.arithmetic.util.CommonUtil.swap;

/**
 *
 *@Description 冒泡排序:每次都是 相邻 的两个数比较大小
 *@Author backen
 *@Date 2021/2/5 13:48
 *
 */
public class Bubblle {
    public static void main(String[] args) {
        int[] arr = new int[]{9,7,3,3,45,2,34,56,78,12,0};
        bubbling(arr);
        printArr(arr);
    }
    public static void bubbling(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

}
