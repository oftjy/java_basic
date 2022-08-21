package com.itheima.hello;

public class 表达式自动类型转换的规则 {
//    1、小范围的类型会自动转换成大范围的类型计算
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        double c = 1.0;
//        int res =a+b+c; int接收会报错
        double res = a + b + c;
        System.out.println(res);
//    2、最終类型会由表达式中最高类型决定
        double res2 = a + b - 2.3;//此处的a 是byte, b是int，2.3是double，所以最高的是int，那么最终接收的也是int
        System.out.println(res2);
//    3、byte short char 是直接转换成int类型进行运算的
//        面试题：
        byte i =10;
        byte j =20;
//        byte k = i+j;这个时候会报错，因为byte，short，char在运算的时候会被当成int类型去计算
        int k = i+j;
        System.out.println(k);

    }
}
