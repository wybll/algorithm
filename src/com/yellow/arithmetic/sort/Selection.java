package com.yellow.arithmetic.sort;


import static com.yellow.arithmetic.util.CommonUtil.*;

/**
 * @Description 选择排序: 选中一个数，与所有的数比较,
 * @Author backen
 * @Date 2021/2/5 13:52
 */
public class Selection {
    public static void main(String[] args) {
        int[] arr = new int[]{9,7,45,2,34,56,78,12,0};
        select(arr);
        printArr(arr);
    }

    public static void select(int[] array){
        if(array == null || array.length < 2){
            return;
        }
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    swap(array,i,j);
                }
            }
        }
    }
}
