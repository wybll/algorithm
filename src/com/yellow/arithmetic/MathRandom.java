package com.yellow.arithmetic;

/**
 * @Description 随机数测试
 * @Author backen
 * @Date 2021/2/10 23:24
 */
public class MathRandom {
    public static void main(String[] args) {


//      随机数
       /* int testTimes = 10000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if(Math.random() < 0.75){
                count++;
            }
        }
        System.out.println((double) count/(double)testTimes);*/

        System.out.println("=================");
// 随机数 * n -->  [0,n)等概率返回
        /*double random = Math.random();

        int testTimes = 10000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if(Math.random()*8 < 5){
                count++;
            }
        }System.out.println((double) count/(double)testTimes);*/
//（int）(随机数 * n)  -->  [0,n-1]随机整数
        System.out.println("=================");

        double random = Math.random();

        int testTimes = 10000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if((int)(Math.random()*8 )< 0){
                count++;
            }
        }System.out.println((double) count/(double)testTimes);
    }
}
