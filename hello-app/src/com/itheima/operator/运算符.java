package com.itheima.operator;

public class 运算符 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a / b);//整数相除最后得到的也是整数，小数直接去掉
        System.out.println(a * 1.0 / b);//如果想要得到计算后的小数，可以在计算的之前把第一个数字乘以1.0
//        面试题：
//        拆分三位数把个十百三位拆分打印出来
        int data = 589;
//        1、个位
        int ge = data % 10;
        System.out.println(ge);
//        2、十位
        int shi = data/10 % 10;
        System.out.println(shi);
//      3、百位
        int baiwei =data/100%10;
        System.out.println(baiwei);
    }

}
