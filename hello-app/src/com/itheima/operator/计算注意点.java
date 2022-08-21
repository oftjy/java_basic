package com.itheima.operator;

public class 计算注意点 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a + 'a');//因为字符a在底层是当做2进制进行存储的，并且值是97
//      ++--运算符注意：
        int aa = 10;
        int res = ++aa;
        System.out.println(res);//++放在变量的前面，先对变量进行+1-1操作，再去运算
        int bb = 10;
        int res2 = bb++;
        System.out.println(res2);//先拿变量的值去运算，再对变量进行+1-1

    }
}
