package com.yellow.arithmetic.util;

/**
 * @Description 工具类
 * @Author backen
 * @Date 2021/2/7 14:08
 */
public class CommonUtil {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
