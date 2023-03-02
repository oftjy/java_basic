package com.itheima.ArrayListP;

import java.util.Scanner;

public class 手机号码的屏蔽 {
    public static void main(String[] args) {
        // 1、键盘录入一个手机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String PhoneNum = sc.next();

        // 2、截取号码的前三位，后四位    18665666520 然后将手机号码的前三位，和手机号码的后四位拼起来
        String beforeStr=PhoneNum.substring(0,3);
        String afterStr =PhoneNum.substring(7);
        String res = beforeStr+"****"+afterStr;
        System.out.println(res);
    }
}
