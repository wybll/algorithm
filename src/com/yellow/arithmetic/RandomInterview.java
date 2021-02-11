package com.yellow.arithmetic;

/**
 * @Description 随机数面试题
 * @Author backen
 * @Date 2021/2/11 0:08
 */

// 思路：首先构造0-1函数，然后利用0-1函数，给 目标数（如题：7）每个位 赋值，再经过加减配到相应的范围
public class RandomInterview {

    public static void main(String[] args) {
        int testTimes = 10000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if(getRandom1To7() == 6)count++;
        }
        System.out.println((double) count/(double)testTimes);
    }


    /*  只能调用getRandom1To5()方法，且不能修改，写出等概率返回1~7整数的随机函数 */
    public static int getRandom1To7(){
        int ans;
        do {
            ans = f3();
        }while (ans == 0);
            return ans;
    }
    public static int getRandom1To5(){
        return ((int)(Math.random()*5)) + 1;
    }
    public static int get01(){
        int ans ;
        do {
            ans = getRandom1To5();
        }while(ans == 3);
        return ans < 3 ? 0 : 1;
    }
    public static int f3(){
        int ans;
        ans = (get01() << 2) + (get01() << 1) +(get01()) ;
        return ans;
    }

}
