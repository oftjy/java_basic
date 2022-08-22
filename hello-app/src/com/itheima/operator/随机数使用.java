package com.itheima.operator;

import java.util.Random;//第一步先引包
import java.util.Scanner;

public class 随机数使用 {
    public static void main(String[] args) {
        Random r = new Random();//new Random 得到随机数对象
        int data = r.nextInt(10);//0-9的随机数，包前不包后  调用功能获取随机数
        System.out.println(data);
//        生成65-91的随机数
//        分析：91-65=26,1:先拿到0-26的随机数,2:在这基础上加上65
        int res = r.nextInt(27) + 65;
        System.out.println(res);
//        猜字游戏：
        int count = 0;
        int ran = r.nextInt(9);
        do {
            Scanner sc = new Scanner(System.in);
            count = sc.nextInt();
            System.out.println(ran);
        } while (count != ran);
        System.out.println("猜中了");
    }
}
