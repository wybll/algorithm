package com.yellow.arithmetic;

/**
 * @Description 二分检索
 * @Author backen
 * @Date 2021/2/25 10:45
 */
public class Dichotomizing {

    public static void main(String[] args) {
        int[] arrs = new int[]{1,2,3,4,5,6};
        System.out.println(dichotomizing(arrs, 10));
    }

    /**
     * 数组必须首先排好序
     * @return 返回索引位置,不存在返回-1
     */
    public static int dichotomizing(int[] arrs, int number){
        if(arrs == null || arrs.length == 0) return -1;
        int L = 0;
        int R = arrs.length-1;
        int mid ;
        while(L <= R){
            mid = (L+R)/2;
            if(arrs[mid] == number) return mid;
            else {
                if (arrs[mid] > number) R = mid-1;
                else L = mid+1;
            }
        }
        return -1;
    }
}
