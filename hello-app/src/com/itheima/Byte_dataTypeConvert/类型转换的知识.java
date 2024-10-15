package com.itheima.hello;

public class 类型转换的知识 {
    public static void main(String[] args) {
//        自动类型转换
//        类型小的变量可以直接赋值给类型大的变量，比如byte可以直接赋值给int变量
        byte a = 20;//a的字节是8位，b的字节是32位，32位有足够的的空间去装
        int b = a;
        System.out.println(b);//发生了自动类型的转换
        int age =23;
    }
}
