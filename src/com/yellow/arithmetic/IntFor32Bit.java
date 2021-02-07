package com.yellow.arithmetic;


/**
 * @Description 一个整数在计算机中以4个字节存储（32位二进制的表现形式）
 * @Author backen
 * @Date 2021/2/7 9:01
 */
public class IntFor32Bit {

    public static void main(String[] args) {
        print(10);
    }
//  核心：与运算,与1操作，按位与
    private static void print(int num) {
        for(int i = 31;i >= 0; i-- ){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

}
