package com.yellow.arithmetic.util;

import com.yellow.arithmetic.sort.Selection;

/**
 * @Description 对数器：通过随机生成的数组，将数组作为 测试数据，循环验证  所写的代码 是否正确。
 * @Author backen
 * @Date 2021/2/11 23:35
 */
public class CompareDevice {

//  生成随机数组 MaxLength最大数组长度  MaxValue数组最大值
    public static int[] getRandomArray(int MaxLength, int MaxValue){
        int[] arrs = new int[(int)(Math.random()*MaxLength)+1];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = (int)(Math.random()*MaxValue);
        }return arrs;
    }
//  比较两个数组值是否相等
    public static boolean compareArray(int[] arr1,int[] arr2){
        if (arr1.length != arr2.length) return false;
        else {
            for (int i = 0; i < arr1.length; i++) {
               if(arr1[i] != arr2[i])return false;
            }
        }return true;
    }
//  对数组进行拷贝
    public static int[] copyArray(int[] arr){
        int[] arrs = new int[arr.length];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = arr[i];
        }return arrs;
    }
//  判断数组是否排序
    public static boolean isSort(int[] arrs){
        if (arrs.length == 1)return true;
        else {
            int Max = arrs[0];
            for (int i = 1; i < arrs.length; i++) {
                if (Max > arrs[i])return false;
                Math.max(Max,arrs[i]);
            }return true;
        }
    }

    public static void main(String[] args) {
        int MaxLength = 10;
        int MaxValue = 1000;
        int testTime = 10;
        int[] randomArray;
        for (int i = 0; i < testTime; i++) {
            randomArray  = getRandomArray(MaxLength, MaxValue);
            Selection.select(randomArray);
            if (!isSort(randomArray)){
                System.out.println("select排序有误");
            }else System.out.println("正确");
        }
    }

}
