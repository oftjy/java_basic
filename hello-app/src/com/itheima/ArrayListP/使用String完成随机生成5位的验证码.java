package com.itheima.ArrayListP;

import java.util.Random;

public class 使用String完成随机生成5位的验证码 {
    public static void main(String[] args) {
// 1、定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
// 2、循环5次，每次生成一个随机的索引，提取对应的字符连接起来即可
        String Code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int ch = r.nextInt(datas.length());//随机出来的索引
            char Str = datas.charAt(ch);//拿到根据随机数取到的字符
            Code+=Str;
        }
        System.out.println(Code);
    }
}
