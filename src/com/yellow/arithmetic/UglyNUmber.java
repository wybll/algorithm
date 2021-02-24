package com.yellow.arithmetic;


/**
 * @Description 丑数（分解因子只包含 2,3,5的正整数）
 * @Author backen
 * @Date 2021/2/24 16:04
 */
public class UglyNUmber {
    public static void main(String[] args) {
        System.out.println(uglyNumber(7));
    }

//  返回第 n 个丑数
    public static int uglyNumber(int n){
        int[] ugly = new int[n + 1];
        ugly[1] = 1; //从下标为1的位置开始装丑数，初值为1
        //定义三个指针，一开始都指向数组下标为1的位置；
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        for (int i = 2; i <= n; i++) {
            //三个指针 当前指向的数 *（2/3/5）得到的最小值就是下一个丑数
            ugly[i] = Math.min(ugly[p5]*5,Math.min(ugly[p2]*2,ugly[p3]*3));
            if (ugly[i] == ugly[p2]*2) p2++;
            if (ugly[i] == ugly[p3]*3) p3++;
            if (ugly[i] == ugly[p5]*5) p5++;
        }
        return ugly[n] ;
    }


}
