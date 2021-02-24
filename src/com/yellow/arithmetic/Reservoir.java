package com.yellow.arithmetic;

import com.yellow.arithmetic.util.CommonUtil;


/**
 * @Description 蓄水池算法
 * @Author backen
 * @Date 2021/2/24 9:31
 */

  /*
    规则:
    给定一个正整数number
    然后定义水池大小 如 int poolSize = 10；
    从1开始，当自增变量cur <= poolSize的时候，必进水池当中，
    当m >= i > poolSize的时候，i以等概率的方式进入池中，并且等概率剔除某一个数，
    若i没进池中，则永不再进入
    当number全部吐完，返回水池中所有的数字
    */

    /*  蓄水池算法应用：
    *       比如有一个游戏很火爆，已经做到国际级了，现在设计一个游戏抽奖系统：
    *       假设1月1日0:00 ~ 1月2日0:00，所有登录用户都可以参与抽奖，中奖用户为100名，开间时间是1月2日0:00整。
    *       如果不用蓄水池算法，得把全球所有服务器的登陆名单拿到手，再进行统计，统计完再从进行抽奖，这是一个相对浩大的工程，
    *       且1月1日23：00之后的登录还得收集，统计，很大可能性是 无法保证 在1月2日0:00整准时开奖
    *       如果是蓄水池算法，首先让全球的服务器 一台奖池服务器 交互数据，记录当前总登录数i,
    *       然后当用户是当天第一次登录，只需要知道该用户 是 全球第i个用户登录用户，并以 100/i的概率是否进入奖池。
    *       如果该用户中奖，则随机踢掉奖池中的一个即可，若不中则不再参与抽奖
    *       到1月2日0:00时，直接公布奖池中的100个名单，OK！！！
    *       首先能保证每个登录的用户抽中的概率是相等的，其次能完美解决数据量和开奖时间的问题
    * */

public class Reservoir {

    public static void main(String[] args) {

        int[] arrs = reservoir(10,1000000);
        CommonUtil.printlnArr(arrs);

    }

    public static int[] reservoir(int poolSize,int number) {
        //定义水池大小
        int[] bag = new int[poolSize];
        int bagi = 0;
        //从1开始吐球球
        for (int i = 1; i <= number; i++) {
            if (i < poolSize){//当水池还没装满的时候，直接装进池子
                bag[bagi++] = i;
            }else{//当池子已经装满的时候
                if (random(i) <= poolSize){//等概率（poolSize/i） 装进池子，
                    bagi = (int)(Math.random()*poolSize); //随机剔除池子的一个数
                    bag[bagi] = i;
                }
            }
        }return bag;
    }
    //随机返回 [1,i] 范围中一个整数
    private static int random(int i){
        return (int)(Math.random()*i) + 1;
    }
}
