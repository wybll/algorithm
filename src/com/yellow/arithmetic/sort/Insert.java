package com.yellow.arithmetic.sort;

import static com.yellow.arithmetic.util.CommonUtil.*;

/**
 * @Description 插入排序 : 前一段先排好序
 * @Author backen
 * @Date 2021/2/7 10:39
 */
public class Insert {
    public static void main(String[] args) {
        int[] arr = new int[]{1,8,2,89,23,5,334,99,0,2483,3};
        insert(arr);
        printArr(arr);
    }

    public static void insert(int[] arr){
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int NewIndex = end;
            while (NewIndex -1 >= 0 && arr[NewIndex] < arr[NewIndex-1] ){
                swap(arr,NewIndex,NewIndex-1);
                NewIndex--;
            }
        }

    }

}
