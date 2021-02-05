import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {
       /*//fb数列
        System.out.println("请输入正整数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int x =0 ;
        int y =1 ;
        int sum  ;
        for (int i = 0; i <count ; i++) {
            if (i==0){
                System.out.print("0"+"\t");
            }
            if (i ==1 ){
                System.out.print("1"+"\t");
            }else {
                sum = x + y;
                x = y;
                y = sum;
                System.out.print(sum+"\t");
            }
        }*/

       /* //选择排序
        int[] arrs = {1,2,3,7,8,9,4,6,5};
        int  a;
        int max ;
        for (int i = 0; i < arrs.length ; i++) {
            for (int j = i+1; j < arrs.length; j++) {
                if (arrs[i] > arrs[j]){
                    max = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = max;
                }
            }
        }
        //冒泡排序
        for (int y = 0; y < arrs.length; y++) {
            for (int i = 0; i <arrs.length-1-y; i++) {
                if (arrs[i] > arrs[i+1]){
                    a = arrs[i];
                    arrs[i] =  arrs[i+1];
                    arrs[i+1] = a;
                }
            }
        }
        System.out.println(arrs);*/

        //长度为16,常用于字符串拼接，线程安全synchronized
        StringBuffer stringBuffer =  new StringBuffer();
        Date date = new Date();
        System.out.println(date);
        DateFormat dataFormat = new SimpleDateFormat("y-M-d H:m:s");
        String formatdate = dataFormat.format(date);
        System.out.println(formatdate);

//        String a = "abc";
//        String b = "def";
//        String d = a + b;
//        String c = "abc"+"def";
//
////        String f = d.intern();
//
//        System.out.println(d==c);

        //String c = "abc";
        /*String d = new String("abc");
        String intern = d.intern();
        System.out.println(c==intern);*/

    }
}
