package com.itheima.hello;

public class 字节类型 {
    public static void main(String[] args) {
        System.out.println('1');
        /*
        * 标识符：
        * 强制要求：不能以数字开头、不能是关键字、区分大小写
        * */
//        整数：
//        byte字节：占一个字节  -128~127数字
        byte number = 98;
//        byte number2 = 128;此时越过127的范围，会报错
        System.out.println(number);
//        short短整型：占2个字节  范围：-32768~32767
        short money =30000;
//        short money2=32768;超越界限
        System.out.println(money);
//        int（默认整数）的声明类型：  四个字节（10位数）4个字节
        int it = 100000;//整形
        System.out.println(it);
//        long 8个字节的存储量：19位数
        long lg =100000000;//长整形
//        long lg2 =100000000000;  报错：随便写一个整数字面量是int类型，虽然没有超过long的范围，但是超过了本身int类型
//      如果需要写一个整数字面量当成long类型，需要在数字后面加L/l
        long lg2 =100000000000000l;
        System.out.println(lg);
        System.out.println(lg2);
//        浮点数：
//        float：单精度，占4个字节存储量
//        float score =98.5;随便写一个小数的字面量，默认是double类型，如果希望随便写一个小数字面量，需要在数字后面加上F/f
        float score =98.5f;
        System.out.println(score);
//        double(默认)：双精度，8个字节存储量：  是特殊计数法   范围大小是10的308次方

//        字符：
//        char：0-65535  2个字节存储量
        char ch ='0';
//        char ch2  ='21';报错

//      引用数据类型：String
    }
}

