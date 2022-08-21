package com.itheima.hello;

public class 强制类型转换 {
    public static void main(String[] args) {
        int a =20;
        byte b = (byte) a;//此处为强行转换，将a强行转换成byte类型
        System.out.println(a);
        System.out.println(b);

        int i =1500;
        byte j = (byte) i;//此处将i强行转换成byte类型，可能会造成数据丢失溢出；
        System.out.println(j);

//        浮点型强转成整形，直接丢掉小数部分，保留
        double score =99.5;
        int it = (int) score;
        System.out.println(it);
    }
}
