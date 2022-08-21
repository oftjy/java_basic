package com.itheima.operator;

import java.util.Random;

public class 随机数使用 {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(10);//0-9的随机数，包前不包后
        System.out.println(data);
    }
}
